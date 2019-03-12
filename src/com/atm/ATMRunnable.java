package com.atm;

import java.util.Scanner;
import com.atm.operation.Operation;
import com.atm.operation.OperationAccount;
import com.atm.operation.UserAccount;

public class ATMRunnable {

    public ATMRunnable() {
        
        final UserAccount account = new UserAccount();
        account.setAccountIdentifier("00000001");
        account.setAccountName("Mathaus Erich Ramos");
        account.setMoney(1000.73d);

        final OperationAccount opaccount = new OperationAccount();
        opaccount.setAccount(account);
        
        try (final Scanner scanner = new Scanner(System.in)) {            
            while (true) {            
                System.out.println("Favor selecionar a operação desejada: \n");
                
                for (Operation op : Operation.values()) {
                    System.out.println(op.displayName());
                }
                
                Integer ordinal = Integer.parseInt(scanner.nextLine());
                Operation operation = Operation.getOperationByOrdinal(ordinal);
                operation.doOperation(scanner, opaccount);
            }
        }
        
    }

    public static void main(String[] args) {
        new ATMRunnable();
    }

}
