package Template;

import java.io.*;

/**
 * Created by kami.wm on 06/02/2017.
 *
 */
class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Dripping Coffee through Filter...");
    }

    @Override
    void addCondiments() {
        System.out.println("Add Sugar and Milk...");
    }

    @Override
    boolean customerNeedsCondiments() {
        String answer = getCustomerInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getCustomerInput() {
        String answer = null;

        System.out.println("Would you like sugar and milk in your coffee (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer==null) {
            answer = "no";
        }
        return answer;
    }
}
