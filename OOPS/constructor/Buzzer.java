
class Buzzer {
    String message;
    
    public Buzzer(int n) {
        this.message = "Hi" + n;
    }

    public String getMessage() {
        return message;
    }
}


// why does adding void causing a trouble
// class Buzzer{
// public void Buzzer(int n) {
//     this.message = "Hi" + n;
// }
// }
