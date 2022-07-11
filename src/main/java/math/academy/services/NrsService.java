package math.academy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class NrsService {
    private Random rand = new Random();
    //random operator


private Double randomizingNumbers(){
    int operator = rand.nextInt(2);
    Double returned;
    returned = rand.nextDouble();

    int decimalPlaces = rand.nextInt(6);
    int tens = 10;

    for (int i = decimalPlaces; i < 6; i++) {
        tens = tens*tens;
    }
    returned = returned * tens;

    if (operator == 0 ){
        returned = -returned;
    }
    return returned;
}

    //creating a method that creat random -/= number

    public List<Double> getNumber() {
        List<Double> returned = new ArrayList<Double>();
        returned.add(randomizingNumbers());
        returned.add(randomizingNumbers());

        return returned;
    }
    public double result;

    public Boolean vlaidateAnswer(double[] numbers) {
        result = numbers[0] + numbers[1];
        if (numbers[2] == result){
            return true;
        }
    return  false;
    }

}