class Animal {
    public void son () {
        System.out.println("L'animal fait un son");
    }
}

class Chien extends Animal {
    public void son () {
        System.out.println("-> Le chien dit bow bow");
    }
}

class Chat extends Animal {
    public void son () {
        System.out.println("-> Le chat dit mec.. retourne faire du java");
    }  
}

class Canard extends Animal {
    public void son () {
        System.out.println("-> le canard dit: quack quack");
    }
}
