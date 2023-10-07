public class Circuit{
    private int firstSwitchState;
    private int secondSwitchState;
    private int lampState;

    public Circuit(){
        this.firstSwitchState = 0; // initially 0 = down
        this.secondSwitchState = 0; // initially 0 = down
        this.lampState = 0; // initially 0 = off
    }

    public int getFirstSwitchState(){
        return this.firstSwitchState;
    }

    public int getSecondSwitchState(){
        return this.secondSwitchState;
    }

    public int getLampState(){
        return this.lampState;
    }


    public void toogleFirstSwitch(){
        this.firstSwitchState = 1 - this.firstSwitchState;
        this.lampState = (this.lampState == 1)? 0:1;
    }
    public void toogleSecondSwitch(){
        this.secondSwitchState = 1 - this.secondSwitchState;
        this.lampState = (this.lampState == 1)? 0:1;
    }

}