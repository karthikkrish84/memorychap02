import java.util.*;
public class PrimeNumber {

    public void GeneratePrimeNumber(Integer numberOfPrimesToPrint){
        Integer localNumber=2;
        List<Integer> primeList=new ArrayList<>();
        primeList.add(localNumber);
        for(int i=0;i<numberOfPrimesToPrint-1;i++){
            localNumber= getNextPrime(localNumber);
            primeList.add(localNumber);
        }
        System.out.println(primeList);
    }
    private Integer getNextPrime(Integer previousPrimeNumber){
        Integer localNumber=previousPrimeNumber+1;
        while (!isPrimeNumber(localNumber)){
            localNumber++;
        }
        return localNumber;
    }
    private Boolean isPrimeNumber(Integer currentPrimeNumber){
        for(int i=2;i<currentPrimeNumber;i++){
            if(currentPrimeNumber%i==0) return false;
        }
        return true;
    }
}
