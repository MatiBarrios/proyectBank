import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomMovementGenerator {
    private static final String TRANSFER="Transfer of ";
    private static final String INPUT="Input of ";
    private static final String WITHDRAWAL="Withdrawal of ";
    private static final String CARD_PAYMENT="Card payment of ";
    private static final String PAYROLL="Payroll of ";
    private static final String PAYMENT_RECEIPT="Receipt of ";

    public ArrayList<String> getMovement(int movementsNumber, String money){
        ArrayList<String> movements= new ArrayList<>();
        for (int x=0;x<movementsNumber;x++){
            int movementNumber= getRandomInt(1, 6);
            String movementType;
            switch (movementNumber){
                case 1:
                    movementType=TRANSFER;
                    break;
                case 2:
                    movementType=INPUT;
                    break;
                case 3:
                    movementType=WITHDRAWAL;
                    break;
                case 4:
                    movementType=CARD_PAYMENT;
                    break;
                case 5:
                    movementType=PAYROLL;
                    break;
                default:
                    movementType=PAYMENT_RECEIPT;
            }
            double randomQuantity=getRandomDouble(0, 3000);
            String movement = movementType+ String.format("%2f",randomQuantity)+" "+money;
            movements.add(movement);
        }
        return movements;
    }

    private int getRandomInt(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max+1);
    }
    private Double getRandomDouble(int min, int max){
        return ThreadLocalRandom.current().nextDouble(min, max+1.0);
    }
}
