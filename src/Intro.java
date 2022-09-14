public class Intro {
    private String fname;
    private String age;

    public Intro(String fname, String age) {
        this.fname = fname;
        this.age = age;
    }

    public Intro(String fname) {
        this.fname = fname;
    }
}

// Suggestions
// 1. Parts of code are seperated based on the code that may vary and the code remains same
// 2. Always try to have interface implementations rather than a concrete implementation.

// Types of pattern
// 1. Creational => Encapsulation of Object Creation [Builder, Prototype, Singleton, Abstract Factory]
// 2. Structural => Composition of Classes. [Adapter, Bride, Composite, Decorator, Facade, etc.]
// 3. Behavioural => How the interaction b/w classes and Object
