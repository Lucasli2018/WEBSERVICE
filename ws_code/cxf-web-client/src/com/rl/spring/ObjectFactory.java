
package com.rl.spring;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rl.spring package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddResponse_QNAME = new QName("http://service.ws.person.rl.com/", "addResponse");
    private final static QName _GetPersonAll_QNAME = new QName("http://service.ws.person.rl.com/", "getPersonAll");
    private final static QName _GetPersonAllResponse_QNAME = new QName("http://service.ws.person.rl.com/", "getPersonAllResponse");
    private final static QName _Add_QNAME = new QName("http://service.ws.person.rl.com/", "add");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rl.spring
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPersonAll }
     * 
     */
    public GetPersonAll createGetPersonAll() {
        return new GetPersonAll();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link GetPersonAllResponse }
     * 
     */
    public GetPersonAllResponse createGetPersonAllResponse() {
        return new GetPersonAllResponse();
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.person.rl.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.person.rl.com/", name = "getPersonAll")
    public JAXBElement<GetPersonAll> createGetPersonAll(GetPersonAll value) {
        return new JAXBElement<GetPersonAll>(_GetPersonAll_QNAME, GetPersonAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.person.rl.com/", name = "getPersonAllResponse")
    public JAXBElement<GetPersonAllResponse> createGetPersonAllResponse(GetPersonAllResponse value) {
        return new JAXBElement<GetPersonAllResponse>(_GetPersonAllResponse_QNAME, GetPersonAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.person.rl.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

}
