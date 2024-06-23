class parent{
    int pv;
    public parent(int a){
        this.pv=a;
        System.out.println("I am a constructor");
    }

    // public void assigner(int a){
    //     this.pv=a;
    // }
    public void display(){
        System.out.println("From parent the number is "+pv);
    }
}

class child extends parent{ 
    int x;
    public child(int a){
        super(a);
        this.x=a;
        System.out.println(x);
        // assigner(x);

    }

    // public void display(){
    //     System.out.println("From child the number is "+x);
    // }
    
}

class index{
    public static void main(String[] args) {
        int a=5;
        child obj=new child(a);
        obj.display();
    }
}

