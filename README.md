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


Jdbc
-------------------------------------------


    

            
                    

                    
                    


                    

