import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class reflection{
    public static void main(String args[]) throws Exception{
        //reflection API is used from JAVA 1.0
        //It is part of lang page so we dont need to import 

        Class p = Class.forName("Product");
        
        //To create class file
        // Class prods = Product.class;
        Class []classes = p.getClasses();

        for(Class c:classes)    System.out.println(c);

        //To find super class of current class
        System.out.println(p.getSuperclass());

        //return constructor used in product class
        Constructor constructors[] = p.getConstructors();
        for (Constructor c:constructors) System.out.println(c);

        //field return all the public instance used in class
        Field f[] = p.getFields();

        //its return null because all the instance are private
        //if we ask for declared fields means we can get all the instance including private
        for(Field fl : f) System.out.println(fl);

        //we also get all method using getmethod method
        Method methods[] = p.getMethods();
        for(Method m :methods) System.out.println(m);

        //we create instance in the class
        Product instancec = (Product)p.newInstance();

        //we also can use private method using setaccesable and then invoke
    }
}