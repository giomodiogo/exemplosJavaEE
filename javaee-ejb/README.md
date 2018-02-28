# exemplosEJBs (Stateless Session Bean, Stateful Session Bean)

Projeto com alguns exemplos de EJBs, utilizando um cliente para consumir os Session Bean.

Para executar o projeto é preciso o **Eclipse** e o **WildFly**.

 **Configurações iniciais**
 
 **Liberar o acesso remoto - WildFly**
 
 - Executar o WildFly com o parâmetro **-b 0.0.0.0**
  **ou**
 - Alterar o arquivo /standalone/configuration/standalone.xml do WildFly
 Substituir:
````xml
<interface name="management">
		<inet-address value="${jboss.bind.address.management:127.0.0.1}"/>
</interface>
<interface name="public">
		<inet-address value="${jboss.bind.address:0.0.0.0}"/>
</interface>
````
Para:
````xml
<interface name="management">
		<any-address/>
</interface>
<interface name="public">
		<any-address/>
</interface>
````

---
**Como o projeto foi criado?**

**Eclipse**

**Criar EJB**
- Criar um projeto EJB Project.
- Criar uma Interface Remota para o Session Bean Stateless e uma para o  Session Bean Stateful.
- Criar um SessionBean Stateless e um Stateful (Implementar as interfaces criadas, no passo anterior).
- **Executar o WildFly, com o projeto criado.**
- Verificar os endereços (nos logs do WildFly) dos Session Beans criados.
- `java:global/ejb-example/SessionBeanStateless!com.ebj.sample.ISessionBeanStatelessRemote`

- Substituir **java:global** por **ejb:** para lookup no Client.

- `ebj:/ejb-example/SessionBeanStateless!com.ebj.sample.ISessionBeanStatelessRemote`

**Quando for um Session Bean Stateful, adicionar o paramêtro ?stateful (identifica que é um Session Bean Stateful), no final da url. Exemplo:**
- `ejb:/ejb-example/SessionBeanStateful!com.ejb.example.ISessionBeanStatefulRemote?stateful`

**Criar Client**
- Criar um projeto Java.
- Build path: Adicionar a dependência do projeto ejb (ejb-example), criado anteriormente, ou importar como uma lib.
- Build path - Adicionar lib **jboss-client.jar** (dentro da pasta /libs).
- Criar classes para consumir o Session Bean Stateless e o Stateful.

**Por fim, executar WildFly e o Client.**
