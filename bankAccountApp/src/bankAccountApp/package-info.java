/**
 * 
 */
/**
 * @author ttruog
 * 
 * LESSONS:
 * 
 * Constructors:
 * need a default constructor in abstract class or child classes have no implicit construct to call
 * if no default constructor is created, then the child class needs to call a parameterized parent constructor with super(parameters) in its own constructor
 * if an abstract method is called in a parent-class constructor, it calls the child's implementation of the abstract method
 *
 * Static:
 * AccountID is static because it does not belong to a specific instance of account, but is a shared counter that tracks all the accounts that have been made thus far
 *
 * Polymorphism
 *  when a method from parent class is overridden in child class so that it performs differently based on which child class it is called on
 * ploymorphism includes calling the parent classes method and then doing additional child-class-specific work
 * 
 * if a method is overridden, it will call the child-classes version of that method even in the parent classes constructor. To call that method, you need super.method() in
 *  child's implementation
 *  Similarly, calling an abstract method in parent class constrctor will call the implemented version of the method in the child class's constructor
 *
 *
 * A child constructor can make variables partly set up by the parent constructor class-specific by modifying them in their own constructor after the parent constructor is called.
 * This will make the childs instance variables different per-class, and a parent method can be called to print these variables, but this doesn't involve overriding (polymorphism)
 * 
 * 
 * Java 8:
 * interfaces can have default implementation
 * 
 * Try can ahve multiple catch
 */

package bankAccountApp;