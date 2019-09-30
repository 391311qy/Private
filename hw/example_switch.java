/** This is for an illustration of the switch in the java
basically it can take care of multiple if statements 

For the 
acquireObject
releaseObject
cleanUp
ERROR

must be written elsewhere.*/

class example_switch {
    public static void main (String[] args) {
        switch (action) {
            case PICK_UP:
            acquireObject ();
            break;
            case DROP:
            releaseObject ();
            break;
            case QUIT:
            cleanUp ();
            break;

            default: 
            ERROR ();
        }
    }
}

// Here the break means leaving the switch statement.