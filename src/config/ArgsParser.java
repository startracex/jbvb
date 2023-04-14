package config;

import java.util.Arrays;

public class ArgsParser {
    private String[] args;
    public String[] origin;

    public ArgsParser(String[] args) {
        this.origin = args;
        this.args = args;
    }

    /**
     * This method will parse the arguments array and return the existence of the matching result.
     *
     * @param name Query basis.
     * @return Existence of matching results.
     */
    public boolean Bool(String name) {
        for (String arg : this.args) {
            if (arg.equals(name)) {
                divideArgs(Arrays.asList(this.args).indexOf(arg));
                return true;
            }
        }
        return false;
    }

    public boolean Bool(String... name) {
        for (String s : name) {
            if (Bool(s)) {
                return true;
            }
        }
        return false;
    }

    public boolean Bool() {
        return Bool("-h", "--help", "-help", "-?", "/?", "-H", "/H", "-Help", "/Help", "-HELP", "/HELP");
    }

    /**
     * This method will parse the arguments array and return the matching result or null
     *
     * @param name The value to be squared.
     * @return First matching result.
     */
    public String String(String name) {
        for (int i = 0; i < this.args.length; i++) {
            if (this.args[i].equals(name) && i <= this.args.length - 2) {
                String Value = this.args[i + 1];
                divideArgs(i, 2);
                return Value;
            } else if (this.args[i].startsWith(name + "=") && i <= this.args.length - 1) {
                String Value = this.args[i].substring(name.length() + 1);
                divideArgs(i);
                return Value;
            }
        }
        return null;
    }

    /**
     * This method will parse the arguments array and return the matching result as a string.
     * If it does not exist, the default value will be set.
     *
     * @param name Query basis.
     * @return First matching result or def.
     */
    public String String(String... name) {
        for (String s : name) {
            if (String(s) != null) {
                return String(s);
            }
        }
        return null;
    }

    public String[] Attach() {
        return Attach("--");
    }

    public String[] Attach(String name) {
        String[] Value = new String[0];
        for (int i = 0; i < this.args.length; i++) {
            if (this.args[i].equals(name)) {
                Value = Arrays.copyOfRange(this.args, i + 1, this.args.length);
                divideArgs(i, this.args.length - i);
            }
        }
        return Value;
    }

    public String[] Other() {
        return this.args;
    }

    public String[] Origin() {
        return this.origin;
    }

    /**
     * Remove the r length of args from the ith position.
     *
     * @param index  The index of the array to be divided.
     * @param relate The length from index to be divided.
     */
    private void divideArgs(int index, int relate) {
        if (index == 0) {
            this.args = Arrays.copyOfRange(this.args, relate, this.args.length);
        } else if (index == this.args.length - 1) {
            this.args = Arrays.copyOfRange(this.args, 0, this.args.length - relate);
        } else {
            String[] argsb = Arrays.copyOfRange(this.args, 0, index);
            String[] argsa = Arrays.copyOfRange(this.args, index + relate, this.args.length);
            this.args = new String[argsb.length + argsa.length];
            System.arraycopy(argsb, 0, this.args, 0, argsb.length);
            System.arraycopy(argsa, 0, this.args, argsb.length, argsa.length);
        }
    }

    private void divideArgs(int index) {
        divideArgs(index, 1);
    }
}

