class Main {

  // 1. Create a dog class in a new file. 
  // 2. Then create a no return type (void) method called 'greeting' with a print statement that states "I am in dog". In the Dog class.
  // 3. Next go back to the main class and create a print statement saying Hello World!. 
  // 4. Now create a dog object from the Dog class.
  // 5. Finally call the new greeting method from the new dog object.  
  
  public static void main(String[] args) {
      System.out.println("Hello World!");

      Dog myDog = new Dog();
      myDog.greeting();
  }


}

