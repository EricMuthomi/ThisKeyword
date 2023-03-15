public class InvokeMethod {
    //Using the this keyword to invoke current class method
    public void myPlayer(){
        System.out.println("Kevin De Bryune is a Man City player.");
    }
    public void myTeam(){
        System.out.println("This is Manchester City!");
        this.myPlayer();
    }
}
