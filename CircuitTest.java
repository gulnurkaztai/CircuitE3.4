public class CircuitTest {

    public static void main(String[] args){
        Circuit circuit = new Circuit();
        System.out.println("Expected initial lamp state is 0");
        System.out.println(circuit.getLampState());
        circuit.toogleFirstSwitch();
        System.out.println("Expected lamp state after toggling the first switch is 1");
        System.out.println(circuit.getLampState());
        System.out.println("Expected first switch state after toggling it once is 1");
        System.out.println(circuit.getFirstSwitchState());
        circuit.toogleSecondSwitch();
        System.out.println("Expected lamp state after toggling the second switch is 0");
        System.out.println(circuit.getLampState());
    }


}
