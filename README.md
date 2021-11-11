Java SE 8
--------------------------------------------------------------------

    OOP
        Class       is a UDT that reperesents an entity
                    in terms of its properties as Fields
                    and its behaviours as well as Methods.


                    class Employee {
                        long empId;
                        String name;
                        double basic;
                        LocalDate dateOfJoining;

                        double getHra(){
                            return basic*0.05;
                        }
                    }

        Object      is a variable of class type.

                    int x = 89;                     x [ 89  ]
                    int y = x;                      y [ 89  ]
                    
                    Employee e1,e2,e3;              e1 [    ] <------------{empId: , name: , basic: dateOfJoining: }
                                                    e2 [    ] <------------{empId: , name: , basic: dateOfJoining: }
                                                    e3 [    ] <------------{empId: , name: , basic: dateOfJoining: }
                    e1 = new Employee();            e4 [    ] <-----------|
                    e2 = new Employee();
                    e3 = new Employee();
                    Employee e4 = e3;
                    
        Encapsulation

                    Access Modifiers/Specifeers

                            private
                            protected
                            public
                            default

                      class Employee {

                        private long empId;
                        private String name;
                        private double basic;
                        private LocalDate dateOfJoining;

                        public Employee(){
                            //initialization........
                        }

                        public long getEmpId(){
                            return empId;
                        } 

                        public void setEmpId(long empId){
                            this.empId=empId;
                        }

                        public double getHra(){
                            return basic*0.05;
                        }
                    }


                    constructor     is a special method that gets invoked as and when an object is allocated.
                                        1. take the same name as that of the class.
                                        2. do not return anything even not void.


                    'this' is a keyword that referess to the currentObject of a method.


        Inheretence

                    class Pen {         //Super class
                        private Barrel barrel;
                        private Rifile rifile;
                        private Cap cap;

                        void write(Paper p){

                        }
                    }

                    class Marker extemds Pen { //Marker is like a Pen //Sub class
                        void write(WhiteBoard w){
                           
                        }
                    }


                    Simple                  Pen <----- Marker

                    Multilevel              Employee <---- Manager <----- GeneralManager <----- Driector

                    Multiple                Super1 <----|
                                                        | - Sub      this is not possibe on java classes
                                            Super2 <----|               

                    Hirarchail                              | - Manager
                                            Employee <------|
                                                            | - ContractEmployee

                    Hybrid                                  | - Manager <----- GeneralManager <----- Driector
                                            Employee <------|
                                                            | - ContractEmployee

                    Constructor Chaining

                            On allcoating an object to a class its constructor is invoekd
                            On allcoating an object to a sub-class its super class constructor is invoke prior to invoking its own constructor

        Polymorphisim

                    is the concept of having more than one method with the same name,

                    if two method in the saem class or in a super and a sub class
                    have the same name bu t differ in param types/ count, then 
                    they are said to be overloaded.

                   if two methods in a super and a sub class
                    have the same signature 
                    they are said to be overridden

                    class Human {

                        public void eat(Apple apple){
                            while(apple.exists())
                                biteAndChewAndSwallow(apple);
                        }
                    }

                    class CivilizedHuman extends Human {

                        public void eat(Apple apple){
                            wash(apple);
                            ApplePiece pieces[] = cut(apple);
                            for(ApplePiece p : pieces)
                                chewAndSwallow(p);
                        }

                        public void eat(IceCream ic){
                           while(!ic.isEmpty())
                                lick(ic);
                        }
                    }

                static
                    on a field          
                                    non-static fields are called instance-variables
                                    static fields are called class-variables

                                    each and every object of a class will have an exclusive allocation of instance-variable, but the class-variable is allocted only once is
                                    commonly accessable by all objects of that class.

                    on a method
                                    a static method can not access a non-static member of a class without
                                    an object of that class. The static method is concered as a common operation
                                    across the objects of the class.


                                    A static field or a static method, if they are public can be 
                                    accessed ouside the class directly with class name without
                                    creating an object to it.

                                    ClassName.staticMethodName();

                    on a class      a class inside a class is called a inner class
                                    a static inner class is called a nested class

                    static block            static {
                                                ///this piece of code
                                                //gets executed as and when the class 
                                                //is invoked for the first time.

                                                //declaring ana object of a class, or to its sub classes
                                                //or accessing any of its public static members 
                                                //is concedered as invoking class.
                                            }

                final
                        on a variable       final variable is concedered a constant
                        on a method         final method can not be overriden
                        on a class          final class can not be inhereted.

                super

                        is used to call a specific super class constructor from a sub-class constructor.
                        is also used to call super class methods in sub-class.

        Abstraction

                is also called behaviour hiding.

                a method having no implementation is called an abstract method.
                an abstract class can not have objects allcoated.
                a class having atleast one abstract emthod msut be marked as abstract.

                abstract class Shape {

                    private int[] sides;

                    public int getPeriemter(){
                        int sum=0;
                        for(int s : sides)
                            sum+=s;
                        return s;
                    }

                    public abstract int getArea();
                }

                sub-class iof an abstract class must implemnent all the abstract methods, if not
                the sub-class also needs to be marked as abstract.

                abstract and final keyword dont ever go at once.

        Interfaces      an interface is special user defiend data type that can not have 
                        any fields except
                            1. abstract methods
                            2. implemented methods called default methods (JDK8 onwards)
                            3. and (constant) final fields


                        class   represents an entity
                        interface represents a role


                        hence a class can implement multiple interfaces
                        where as a class extends only one class
                        and an interface can extend only one interface

                            Human               Animal          Bird
                              |                    |              |
                            ---------           ------------     ----------------
                            |       |           |          |     |              |
                            Gent    Lady       Male     Female   MaleBird  FemaleBird   

                            Mother           Father         Sibling
                              feed()            protect()       share()
                              givesBrth()


        Type Casting

                        char -> int -> double -> flaot ..etc        Broadening (implict)
                        
                        char ch = 'a';
                        int x = ch;
                        double d = x;

                        float -> double -> int -> char ..etc        Narrowing (explict)

                        double d = 56.5;
                        int x = (int) d;


                                                            | - Manager <----- GeneralManager <----- Driector
                                            Employee <------|
                                                            | - ContractEmployee

                        Employee e1 = new Employee();
                        Employee e2 = new Manager();
                        Employee e3 = new ContractEmployee();
                        Employee e4 = new Director();


                        //Manager m = new Employee(); //not possible, insuffieciant details

                        Manager m = (Manager) e2;
                        Director d = (Director) e4;
                        //Manager m2 = (Manager) e3; //gives a ClassCastException

                        class EmployeeServive {

                            public void hikeSal(Employee e,doiuble percent){
                                e.setSalary(e.getSalary() +(e.getSalary()*percent));
                            }
                        }

    package
                is a collection of classes and sub-packages.


    java.lang

            Object
                        boolean equals(Object)          o1.equals(o2)
                        int hashcode()
                        String toString()
            Class
            System
                    in
                    out
                    err
            Math


            Integer         Wrapper Classes
            Double
            Float
            Short
            Long
            Character
            Boolean
            Void

            String              are immutable
            StringBuffer
            StringBuilder

            Runnable
            Thread

            Throwable
            Exception
            RuntimeException


                        Throwable (i)
                         |
                         ------------------------
                         |                      |
                        Error                   Exception
                                                    |
                                                    --------------------------------
                                                    |                              |
                                                    RuntimeException            [CHECEKED EXCEPTIONS]
                                                        |
                                                    [UNCHECKED EXCEPTIONS]

                        CHECKED EXCEPTIONM are verified by the compiler if ahndled or not, if not
                        handled the compiler will force us to handle them, on the other hand
                        UNCHECKED EXCEPTIONS are ignored by the compiler.

                        UNCHECKED EXCEPTIONS
                                NullPointerException

                                        public double getTax(Item i){
                                            return i!=null?i.getPrice()*0.7:0; //avoiding NullPointerException
                                        }

                                ArrayIndexOutOfBoundException
                                ArtithmeticException

                                Unchecked exceptions can be avoided and need not be 
                                handled. hence they are ignore by the compiler.

                        CHECKED EXCEPTIONS
                                FileNotFoundException
                                IOException
                                SQLException
                                ...etc

                                try{
                                    //...read from a file...
                                }catch(FileNotFoundException e){
                                    //excepton handling code..
                                }catch(IOException e){
                                    //excepton handling code..
                                }catch(SQLException e){
                                    //excepton handling code..
                                }finally {
                                    //piece of code that has to execute at any cost.
                                    //things liek clsoign a db connection or closing an input out stream..
                                }

                                try-with-resources....
                                --------------------------------------
                                try( //declare connection objects/iostream objects...){
                                    //...read from a file...
                                }catch(FileNotFoundException e){
                                    //excepton handling code..
                                }catch(IOException e){
                                    //excepton handling code..
                                }catch(SQLException e){
                                    //excepton handling code..
                                }

                                multi-catch
                                --------------------------------------
                                try( //declare connection objects/iostream objects...){
                                    //...read from a file...
                                }catch(FileNotFoundException | IOException | SQLException e){
                                    //excepton handling code..
                                }

                        User Defiend Exceptions

                                class BankingException extends Exception {
                                    public BankingException(String message){
                                        super(message);
                                    }
                                }

                                if(account.getBalance()<wuithdrawAmount) {
                                    throw new BankingException("Insufficient Balance");
                                }


                        Propagating Exceptions

                                throws      is sued to propagate an exception from a method to its caller.

                                class BankingService {

                                    public void withdraw(BankAccount account,double withdrawAmount) throws BankingException{
                                        if(account.getBalance()<wuithdrawAmount) {
                                            throw new BankingException("Insufficient Balance");
                                        }

                                        account.setBalance(account.getBalance()-withdrawAmount);       
                                    }
                                }

                                Database Tier               Application Tier
                        
                                    Oracle/MySQL    <---->    [ DAO  <--> SERVICE <--> UI ]

    Generics

            is a ADT - Abstract Data Type

            class SwppingService<T> {
                public void doSwap(T e1,T e2){
                    T temp = e1;
                    e1 = e2;
                    e2 = temp;
                }
            }

            SwappingService<Employee> s1 = new SwappingService<>();
            s1.doSwap(e1,e2);

            SwappingService<Student> s2 = new SwappingService<>();
            s2.doSwap(stud1,stud2);
            
            SwappingService<String> s3 = new SwappingService<>();
            s3.doSwap("Hello","World");

            SwappingService<Integer> s4 = new SwappingService<>();
            s4.doSwap(n1,n2);

    java.util

            Scanner
            Random
                Random()
                Random(int seed)

                int nextInt(int upperBound);

            -----------------------------Collections--------------------------------        

                Collection                          Map
                    |                                |
                -----------                         SortedMap
                |          |
                Set       List
                 |
                SortedSet

                Collection
                    is jsut a super type for both sert and list

                        void add(element)
                        void remove(element)
                        boolean contains(element)
                        int size()
                        boolean isEmpty()
                        Stream stream()

                Set             
                    1. a set represents a non-linear collection of elements (Trees ..etc).
                    2. we do not have index and hence can not access the elements in random fashon.
                    3. No duplicte elements are allowed
                    4. Only one null is allowed
                
                                HashSet             the order of elements retrival is not pridictable
                                LinkedHashSet       the order of elements retrival is entry order
                                TreeSet             the order of elements retrival is in sorted order

                List            
                    1. a list represents a linear collection of elements (Trees ..etc).
                    2. we have index and hence can do access the elements in random fashon.
                    3. duplicte elements are allowed
                    4. multiple null is allowed
                    5. Preserves the entry order for retrival.
                
                                Vector          growable synchronized array
                                ArrayList       growable array
                                LinkedList      doubly linked list implemented

                Map             
                    1. a map represents a group of key-value pairs.
                    2. key can not be duplicte
                    3. a key can not be null.
                    
                        void put(key,value)
                        void set(key,value)
                        void remove(key)
                        boolean containsKey(key)
                        Set keySet()
                        Object get(key)
                        int size()
                        boolena isEmpty()
                
                                HashMap         the order of elements retrival is not pridictable                    
                                LinkedHashMap   the order of elements retrival is entry order
                                TreeMap         the order of elements retrival is in sorted order on key


                java.util.Collections

                java.lang.Comparable        as natural sorting order
                java.util.Comparator        as a customized sorting order

    java.io - IOStreams

        Input Output Streams

                Binary Stream                                           Charecter Stream

            OutputStream            InputStream                 Writer              Reader
            |                          |                        |                   |
            |- FileOutputStream        |-FileInputStream        |-FileWriter        |-FileReader    
            |- DataOutputStream        |-DataInputStream        |-PrintWriter       |-InputStreamReader
            |- ObjectOutputStream      |-ObjectInputStream                          |-BufferedReader
            |- PrintStream
            

        File
        IOException
        FileNotFoundException

        Serialization           java objects are written into a stream  ObjectOutputStream
        DeSerialization         java objects are read out of a stream   ObjectInputStream

        Serializable            is a marker interface (having zero methods). Objects of a class
                                are allowed to be serialized or deserialized only if that class implements Serializable
    
Java 8 Features
------------------------------------------

    java.time
        LocalDate   
        LocalTime
        LocalDateTime
                            .now()
                            .of
        ZonedDateTime
                            .now(ZoneId)

        Period      .between(start,end)
        Duration    .between(start,end)

        DateTiemFormatter   .ofPattern("");

                d dd            day
                M MM MMM MMMM   month
                yy yyyy         year
                h hh H HH       hour
                m mm            minute
                s ss            second
                a               am/pm

    Enhancements to Interfaces

            1. interfaces can have methods with implementation - default methods - marked with 'default' keyword
            2. interfaces can have static methods
            3. functional interfaces - are thso that have one and only abstract method, @FunctionalInterface is
                an annotation used to check at compilation if the interface so marked has only one abstract method.        

    Lambda Expressions

        Functional Interface can be implemented using lambda expressions.
        
        @FunctionalInterface
        interface i1{
            void m1();
        }

        i1 iobj = () -> {
                .............
        };

        iobj.m1();

        Supplier        is an functional interface that has a method which returns a value and has no args.
        Consumer        is an functional interface that has a method which does not returns a value and has args.
        Predicate       is an functional interface that has a method which always returns boolean
        Operator        is an functional interface that has a method which returns a value and has args, and
                        all the args and the return value are of the same data type.
        ....etc

        java.util.function

    Method References

        is hold a method of any class or object into an object of respective functional interface.

    java.util.stream

        Stream      is a flow of data.

        Collection / Array  -------------Stream------------------------ Consume / Collect into another collection

        Rain Water -----Mesh Filter-----Membraine------Chloride-------  Over Head Water Tank


        Collection::stream
        Arrays::stream
        Stream.of(,,,,)

            Terminal Stream Operators

                forEach(Consumer)               void
                reduce(BinaryOperator)          java.util.Optional

                            BinaryOperator<Integer> sum = (n1,n2) -> n1+n2;
                            Stream.of(1,2,3,4,5).reduce(sum); // sum(sum(sum(sum(1,2),3),4),5)

                collect(Collector)              List/Set/Map

                        collect all the data in the stream into a List/Set/Map

                            Collectors.toList()
                            Collectors.toSet()
                            Collectors.toMap(keyMapper,valueMapper)

            Intermediate Stream Operators

                        filter(Predicate)        Stream
                        map(Operator)            Stream
                        
Jdbc
-------------------------------------------

    Java Database Connectivity

    RDBMS  <--DRIVER---->  <----JDBC----->   Java Application

    is a specification (declaration with no implementation).
        jdbc drivers are the vendor provided implementations for the JDBC

    Oracle              <-Oracle Thin Driver-->
    MySQL Server        <-MySQL ConnectorJ -->  <----JDBC----->   Java Application
    Ms SQL Server       <-Ms Jet Drivers   -->

    
    Jdbc 4.0 (java.sql)
    -----------------------

        Step 1:
                Ensure that the driver is available in the class path,
                or we can install them using a build tool - Maven

        Step 2:
                Connection con = DriverManager.getConnection(dbUrl,uid,pwd);
            
                dbUrl or called connection string is the where abouts of the database

                    oracle      jdbc:oracle:thin:@localhost:1521:XE
                    mysql       jdbc:mysql://localhost:3306/databaseName

        Step 3:
                Collect Database Metadata

                            DatabaseMetaData dbmd = con.getMetadata();

                Execute DDL/DML/DRL

                            Statement st = con.createStatement();

                            boolean st.execute("create or alter or drop query");
                            int st.executeUpdate("insert or update or delete query");
                            ResultSet st.executeQuery("select query");

                            PreparedStatement pst1 = con.prepareStatement("create or alter or drop query");
                            PreparedStatement pst2 = con.prepareStatement("insert or update or delete query");
                            PreparedStatement pst3 = con.prepareStatement("select query");

                            boolean pst1.execute();
                            int pst2.executeUpdate();
                            ResultSet pst3.executeQuery();

                                setInt
                                setFloat
                                SetString .....

                Call a Procedure or a Function

                            CallableStatement cst = con.prepareCall("procedure or fucntion call");

                            cst.execute();

                
    JPA with Hibernate
    ------------------------------------------------

        Java Persistence API

        is an ORM (Object Relational Mapping) specification
                    
                          OOP                       RDBMS

        Entity Def      class                       table schema
        Entity          object                      record/row
        Property        field                       column/attribute          
        Behaviour       method                      --------

        Relationship
            Is A        inheretence                 Single-Table        allemps [ empid,name,basic,hra ]
                                                    Join-Table          emps [ empid,name,basic]  managers[empid,hra]
                        class Employee{             Table-Per-Class     onlyemps [empid,name,basic]
                            int empid;                                  onlymanagers [empid,name,basic,hra]
                            String name;
                            double basic;
                        }

                        class Manager extends Employee{
                            double hra;
                        }


            Has A(Aggregation)
                Composition                             Single Table    Emp [empid,name,basic,doorNo,street]
                                class Address {
                                    Stirng doorNo;
                                    String street;
                                }

                                class Employee {
                                    int empId;
                                    String name;
                                    String basic;
                                    Address address;
                                }

                Assosiations    
                  OneToOne      class BankAccount {     Joins       empid of Emp table 
                                    String accNum;                  will be a foreign key in bankaccoutns table
                                    String ifsc;
                                    Employee holder;
                                }

                                class Employee {
                                    int empId;
                                    String name;
                                    String basic;
                                    BankAccount salAccount;
                                }

                  OneToMany     class Department {        Joins     deptId from depts table will be 
                  ManyToOne         int deptId;                     the foriegn key in emps table
                                    String deptName;
                                    Set<Employee> emps;
                                }

                                class Employee {
                                    int empid;
                                    String name;
                                    double basic;
                                    Department dept;
                                }

                   ManyToMany   class Project {           Joins via thrid table
                                    int prjId;                      proejcts [ prjid, prjTitle ]
                                    String prjTitle;                emps [empid,name,basic]
                                    Set<Employee> team;             prjemps [ prjid,empid ]
                                }

                                class Employee {
                                    int empid;
                                    String name;
                                    double basic;
                                    Set<Project> projects;
                                }

                                class Project {                          proejcts [ prjid, prjTitle ]
                                    int prjId;                           emps [empid,name,basic]
                                    String prjTitle;                     contributions [ prjid,empid ]
                                    Set<Contribution> contributions;
                                }

                                class Employee {
                                    int empId;
                                    String name;
                                    double basic;
                                    Set<Contribution> contributions;
                                }

                                class Contribution {
                                    Project project;
                                    Employee contributor;
                                    String role;
                                }
            
        
        JPA and JTA is the ORM adopted by Java and hence JPA is a specification (declartion).
        JPA impleemntations or providers:
                Hibernate
                iBates
                ...etc

        RDBMS  <--DRIVER->  <-JDBC->  <-Hibernate->  <-JPA->  Java Application

            Java Persistence API        javax.persistence
            Java Transaction API        javax.persistence, javax.transaction

                1. Configuaration
                    inform the JPA provider details like, driver,connection string username and password.

                2. JPA/JTA Annotation based Mapping
                                                Level
                                                -------------------------
                    @Entity                     class
                    @Table(name="")             class

                    @Inheretence(strategy="")   class
                    @DescriminatorColumn        class
                    @DescrimiantorValue         class

                    @Id                         Field
                    @GeneratedValue             Field
                    @Column(name="")            Field
                    @Transiant                  Field

                    @OneToOne                   Field
                    @OneToMany                  Field
                    @ManyToOne                  Field
                    @ManyToMany                 Field

                    @JoinColumn                 Field

        JPA API
        -----------------------------

            EntityManagerFactory

            EntityManager
                persist             insertion
                merge               updation
                find                get by id
                delete              deletion
                createQquery
                getTransaction
                flush
                close

        JPA Entity LifeCycle
        --------------------------------------
            
            Transiant
                                Entity e = new Entity();

            Persistant
                                em.persist(e)       Entity e = em.find(Entity.class,id)
                                                    em.merge(e)

            Detached
                                em.remove(e)

                                em.flush()

                                em.close()

    Spring Framework
    ------------------------------------------------

        Java Framework offering a wide range of modules 
        each address a specific Enterprise Level Solution.

        Spring Core                     DI (Dependency Injection)  IoC (Inversion of Control) - BeanFactory
        Spring Context                  ApplicationContext - AutoWiring
        Spring SpEL                     Spring Expresion Language - Externalized Configuaration
        Spring Boot                     Auto Configuaration - Rapid Application Development
        Spring Web (MVC/REST)           MVC Design Pattern Baed Web applications or REST webservices
        Spring Data                     Auto Implementation of Repositories
        
        Spring Test                     Testing on Spring Application

        Spring AOP                      Aspect Oriented Programming
        Spring Security                 Autherization and Authetencation 
        
        ,....etc
     
    Lab Setup
    -----------------------------------------------------
        JDK 1.8
        STS Spring Tool Suite
        Oracle

    Spring Core and Spring Context
    ----------------------------------------------------------------------

        Dependency Injection

            interface Dao{
                ....
            }

            class DaoJdbcImpl implements Dao{
                ......
            }

            class DaoJpaImpl implements Dao{
                ......
            }

            interface Service {
                .....
            }

            class ServiceImpl implements Service{
                private Dao dao;

                public ServiceImpl(Dao dao){        //constructor injection
                    this.dao = dao;
                }
                ....

                public void setDao(Dao dao){        //setter injection
                    this.dao=dao;
                }
            }


        Context         is the server that creates and manges beans and supplies them on demand.
        Component       is any class that represents a logic rather than data holder like 
                            daos,controllers, services ..etc
        Bean            is an object of a component that being created, manged and supplied by a context.

                    
        Bean Configuaration     is to inform the context 
                                        1. how many components do we have
                                        2. how many beans do we need
                                        3. how are the beans dependent on one-another

            Xml Based Bean Configuaration
            Annotation Based Bean Configuaration
            Java Based Bean Configuaration

        Annotation Based Bean Configuaration

            @Component
                @Service
                @Repository
                @Controller
                @RestController
                @ControllerAdvice
                ...etc

            @Configuaration
            @ComponentScan("basePackage")

            @Value              externalized configuaration through SpEL
            @PropertySource

            @Autowired          autowire by type
            @Primary
            @Qualifier          autowire by name

                            @Autowired
                            private Type bean;      ///field injection
                            -----------------------------------------------------
                            @Autowired
                            public ParentType(Type bean){       //constructor injection
                                this.bean=bean;
                            }
                            --------------------------------------------------------
                            @Autowired
                            public void setBean(Type bean){       //setter injection
                                this.bean=bean;
                            }

        Java Based Bean Configuaration
    
        @Configuaration
        public class MyConfig{
            @Bean
            public LocalDateTime currentTime(){
                return LocalDateTime.now();
            }
        }

        Bean Scope
    
            @Scope
                        singleton
                        prototype
                        request
                        session
                        global-session

    Spring Boot
    ----------------------------------------------------------------------

        is a spring module that offers Auto Configuaration and enables RAD (Rapid Application Development)

                Spring Web
                    1. map all incoming request to a servlet called DispatcherServlet
                    2. configuare a ViewResolver
                    3. configuare a RequestHandler
                    4. configuare the CORS policies
                    5. configuare WebConfiguarationAdapter (web.xml)

                Spring Data
                    1. Configuare the datasource proeprties
                    2. Configuare the Jpa and Hibernate as aprovider
                    3. Configuare the hibernate proeprties

                Spring Security
                    1. Configaure the authentication mode
                    2. Configaure the roles
                    3. Configuare the authorization rules
                    4. Configuare the UserNAem,passwords.

            If we use spring boot along with these modules, those minimum configs will come
            ready-made.

        Spring boot also offers embeded servers. as a result it eanbles server-less application.

        Spring Boot uses externalized config (application.properties) for customizing the configuarations.

        @SpringBootApplication  =   @Configuaration
                                    @EnableAutoConfiguaration
                                    @ComponentScan
                                    @PropertySource

        Spring Boot Project (Spring Starter Project) can be initialized
        ----------------------------------------------------------------------
            1. SpringInitializer start.spring.io
            2. Spring Starter Project Wizard from STS
            3. Spring Boot CLI
                    spring init

                            
    Spring Data JPA
    ----------------------------------------------------------------------

        is a spring module that offers automatic dynamic implementation of a JPA based repository (dao).

        CrudRepository
            JpaRepoistory

        @Entity
        public class Employee {

            @Id
            @GeneratedValue
            private Long empId;
            private String name;
            private String emailId;
            private Double basic;

            //constructor,setter and getters
        }
        
        @Repository
        public interface EmployeeRepo extends JpaRepository<Employee,Long>{

            boolean existsByEmailId(String emailId);
            Employee findByEmailId(String emailId);
            List<Employee> findAllByName(String name);

            @Query("SELECT e FROM Employee e WHERE e.basic between :lowerBound and :upperBound")
            List<Employee> getAllInBasicRange(Double lowerBound,Double upperBound);
        }
        
        spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
        spring.datasource.username=root
        spring.datasource.password=root
        spring.datasource.url=jdbc:mysql://localhost:3306/empDB?createDatabaseIfNotExist=true
        spring.jpa.hibernate.ddl-auto=update

        spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
        spring.datasource.username=hr
        spring.datasource.password=hr
        spring.datasource.url=jdbc:oracle:thin:@localhost:1521:XE
        spring.jpa.hibernate.ddl-auto=update

    Spring Web
    ----------------------------------------------------------------------

        Dynamic Web Applciations based on Single Front Controller Design Pattern
        REST api (RESTful WebServices)

        Dynamic Web Appliction
        --------------------------

            On the web server, we will have a program which when recieves a requests, will
            generate a html content and the generated html content is passed 
            back in the response to the client.

            Servlet and JSPs 
            -----------------------------
                Servlet         is a java class that can process a req and generate a response.
                JSP             is a java server page, this is a view engine (Java embeded into html)

                MVC Design Pattern
                ---------------------
                Model           is a java class (POJO) that encapsualte data and is shipped between views and 
                                controllers
                View            is a .tml / .jsp or any other page
                Controller      is a class that recevies the req and generates the response, typically a Servlet


                    Web Server (tomcat)                                                     WebClient(Chrome)
                    ----------------------------------------                                ------------------

                        DynamicWebApplciation   (contextUrl)

      Database  <--->  Dao /Repo  <---> Service  <---> Controller   <---------REQUEST---------
                                                            |
                                                            |(model)
                                                            ↓
                                                          View      ---------RESPONSE---------->

                Servlets API (specification)
                -----------------------------

                    javax.servlet
                        GenericServlet      class
                            void service(ServletRequest,ServletResponse);
                            ServletContext getServletContext()
                            ServletConfig getServletConfig()

                        ServletContext      interface       represents the webApplciation as a whole
                        ServletConfig       interface       represent local data of a particular servlet
                        ServletRequest      interface
                        ServletResponse     interface

                    javax.servlet.http
                        HttpServlet         class           extends GenericServlet
                            void doGet(HttpServletReqeust,HttpServletResponse)
                            void doPost(HttpServletReqeust,HttpServletResponse)

                        HttpServletReqeust  interface

                            String getParameter(String name);

                        HttpServletResponse interface

                            void setContentType(String contentType);
                            PrintWriter getWriter();

                        HttpSession
                        Cookie
                        ReqeustDispatcher

            Raising a request from a browser
            ---------------------------------------------
                1. Type a url in the browser                GET to the url
                2. Click a link on the current page         GET to the url
                3. Submit a form                            depending on the 'method' attribute 
                                                            of the <form></form>
                                                            either GET/POST tot he url is raised.
            
            WebServers are ServletContainers as well, as they manage the creation
            and lifecycle of Servlet objects.

                Servlet LifeCycle

                    constructor()
                        init()
                        doget()/doPost()    <-------------  Req
                                            --------------> Resp
                        destroy()

            JSP - Java Server Pages
            ---------------------------------------------
                a .jsp page is a html page embeded with java code.

                that allows me to handle data and generate html dynamically.

                JSP Elements
                --------------------------
                    Directives          <%@ directiveName attrib="value" %>
                                            page        
                                            taglib
                                            include

                    Declaratives        <%! declarations; %>        field variable declarations

                    Expressions         <%=javaExpression %>

                    Scriplets           <% javaCodeSnippet %>
                    
                    Actions             <jsp:actionName attrib="value" />
                                            include
                                            forward
                                            useBean

                JSP implicit objects
                -------------------------------------

                appliction          ServletContext
                page                PageContext
                config              ServletConfig
                out                 JspWriter
                                        <% out.print("something"); %>
                                        <%="something"%>                
                request             HttpServletRequest
                response            HttpServletResponse
                session             HttpSeesion

                
                application vs session vs reqeust attributes
                ------------------------------------------------------------
                
                    request.setAttribute(key,object)
                    request.getAttribute(key)
                    request.removeAttribute(key)

                    HttpSession session = request.getSession();
                        //session is a temporary memory block allocated for each user
                        //of a web application on the server, when the first request from that
                        //user hits the server
                        //every session has an expiry time and as and when the successive req from
                        //the user hits the server within the expirty time, the session extends, else
                        //it expiries.
                    
                    session.setAttribute(key,object)
                    session.getAttribute(key)
                    session.removeAttribute(key)

                    session.setMaxInactiveInterval(long ms);
                    session.getMaxInactiveInterval();
                    session.abandon(); 

                    session.getSessionId();

                    ServletContext application = getServletContext();
                    application.setAttribute(key,object)
                    application.getAttribute(key)
                    application.removeAttribute(key)

                EL (Expression Language)
                ------------------------------------------------------------
                
                    <% String msg = (String) request.getAttribute("msg"); %>
                    <%=msg %>

                    ${msg} //retrive from appliction ?? retrive from session ?? retrive from req

                    <% Employee e = (Employee) request.getAttribute("emp"); %>
                    <%=e.getFullName()%>

                    ${emp.fullName}

                JSTL (Java Standard Tag Library) - core tags
                ------------------------------------------------------------

                    <c:if test="${ msg!=null }">
                        <p><strong>${msg}</strong></p>
                    </c:if>

                    <c:forEach var="e" items="${empList}" >
                        <p>${e.fullName}</p>
                    </c:forEach>

                    <c:choose>
                        <c:when test="${cond1}">
                            <p>This para is render if cond1 is true</p>
                        </c:when>
                        <c:when test="${cond2}">
                            <p>This para is render if cond2 is true</p>
                        </c:when>
                        <c:when test="${cond3}">
                            <p>This para is render if cond3 is true</p>
                        </c:when>
                        <c:otherwise>
                            <p>This para is render if non of the conditions is true</p>
                        </c:otherwise>
                    </c:choose>

        Spring Web MVC
        ----------------------------------------------------------------------

            Single Front Controller Design Pattern
                      
                      Repo  <---> Service  <---> Controller  <-extracted data--| 
                      Repo  <---> Service  <---> Controller                    |
    Database  <--->   Repo  <---> Service  <---> Controller       FrontController <---------REQUEST---------
                      Repo  <---> Service  <---> Controller                 ↑   |
                      Repo  <---> Service  <---> Controller  --ModelAndView-|   |
                                                                                |
                                                                                |(model)
                                                                                ↓
                                                                                View -----RESPONSE---------->

        FrontController?
            1. org.springframework.....DispatcherServlet
            2. receive the HttpServletRequest for any URL in the current web app.
            3. tasks like managing session/ extracting query parameters are all done here..
            4. the extracted data is passed as params to the underling controller
            5. once the controller finishs its job, the controller passes the model and viewName
                to the frontcontroller
            6. the resultant model is then attached to the request/session .
            7. the request is forwarded to the respective view refered by the viewName.

        UrlHandlerResolver
            an interface implemented by
                ControllerBeanNameUrlHandlerResolver    (depricated in spring 5)
                SimpleUrlHandlerResolver
            
            used by the FrontController (DispatcherServlet) to figure out the controller 
            related to a particular req. 

                SimpleUrlHandlerResolver        @RequestMapping(url="",method=GET/POST)

        ViewResolver
            an interface implemented by
                XmlResourceViewResolver                     .xml        contains viewName and viewPath
                MessageBundleResourceViewResolver       .properties     contains viewName=viewPath
                InternalResourceViewResolver            prefix
                                                        suffix

                                                        viewPath = prefix + viewName + suffix;

            used by the FrontController (DispatcherServlet) to figure out the view related
            to a viewName.

        View ?
            any view engine, JSP or Thymeleaf or JSF ..etc
            we are going to use JSP as the view engine.

        Controller?
            1. A controller is any POJO (Plain Old Java Object) marked with @Controller.
            2. A controller must accomidate methods to handle incoming request and return
                    either a String (viewName) or a ModelAndView object, and these emthods are called actions.

                assuming InternalResourceViewResolver prefix="/page/"   and suffix =".jsp"

                @Controller
                public class DefaulController {

                    @RequestMapping(value="/home",method=Method.GET)
                    public String showHomePageAction(){
                        returns "index";
                    }

                }


                GET http://localhost:8888/home          DefaultController::showHomePageAction() is invoked
                
                /pages/index.jsp    will be the response

                @RequestMapping
                    GetMapping
                    PostMapping ...etc
