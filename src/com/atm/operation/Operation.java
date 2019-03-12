package com.atm.operation;
import java.util.Scanner;

public enum Operation {

    SACAR {
        @Override
        public void doOperation(Scanner scanner, OperationAccount account) {
            System.out.println("\nFavor informar o valor da operação: \n");
        	account.setOperationValue(Double.parseDouble(scanner.nextLine()));
        	account.decrease(this);
            System.out.println();
        	account.printLastLog();
            System.out.println();
        }
    },
    DEPOSITAR {
        @Override
        public void doOperation(Scanner scanner, OperationAccount account) {
        	System.out.println("\nFavor informar o valor da operação: \n");
        	account.setOperationValue(Double.parseDouble(scanner.nextLine()));
        	account.sum(this);
        	System.out.println();
        	account.printLastLog();
        	System.out.println();
        }
    },
    SALDO {
        @Override
        public void doOperation(Scanner scanner, OperationAccount account) {
            account.accountValue();
        }
    },
    TRANSFERIR {
        @Override
        public void doOperation(Scanner scanner, OperationAccount account) {
        	System.out.println("\nFavor informar favorecido: \n");
        	scanner.nextLine();
        	System.out.println("\nFavor informar o valor da operação: \n");
        	account.setOperationValue(Double.parseDouble(scanner.nextLine()));
        	account.decrease(this);
            System.out.println();
        	account.printLastLog();
            System.out.println();
        }
    },
    EXTRATO {
        @Override
        public void doOperation(Scanner scanner, OperationAccount account) {
        	System.out.println();
        	account.printAllLogs();
        	System.out.println();
        }
    },
    SAIR {
    	@Override
    	public void doOperation(Scanner scanner, OperationAccount account) {
    		System.exit(0);
    	}
    };

    public abstract void doOperation(Scanner scanner, OperationAccount account);
    
    public String displayName() {
        return this.ordinal() + " - " + this.name();
    }
    
    public static Operation getOperationByOrdinal(int ordinal) {
        for (Operation o : values()) {
            if (o.ordinal() == ordinal) {
                return o;
            }
        }
        throw new RuntimeException("Operação não existente!");
    }

}
