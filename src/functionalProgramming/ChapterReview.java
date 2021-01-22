package functionalProgramming;



    class Animal {
        String test = "Animal Variable";
        void jump(int b) { System.out.println("Animal"); }
    }
    class Cat extends Animal {
        String test = "Cat Variable";
        void jump(int a) { System.out.println("Cat"); }
    }
    class Rabbit extends Animal {
        void jump() { System.out.println("Rabbit"); }
    }
    class Circus {
        public static void main(String args[]) {
            Animal cat = new Cat();
            Rabbit rabbit = new Rabbit();
            System.out.println(cat.test);
            cat.jump(3);
            rabbit.jump();
        }
    }

