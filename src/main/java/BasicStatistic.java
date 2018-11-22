import java.util.ArrayList;

/**
 * very simple implementation of the BasicStatisticInterface
 */
public class BasicStatistic implements BasicStatisticInterface {
    private ArrayList<Double> data = new ArrayList<Double>();

    @Override
    public void addDoubleToData(Double valueToAdd){
        data.add(valueToAdd);
    }

    @Override
    public void clearData(){
        data.clear();
    };
	
    @Override
    public int numberOfDataItems(){
//        int rv = 0;
//        return rv;
        return data.size();
    }

    @Override
    public Double sum(){
//        double rv = 0.0;
//        return rv;
        double temp = 0.0;
        for (int i = 0; i < data.size(); i++){
            temp += data.get(i);
        }

        return temp;
    }

    @Override
    public Double highestValue() throws NoDataItemsException {
        double rv = 0.0;
        return rv;
    }

    @Override
    public Double getMean() throws NoDataItemsException {
        double rv = 0.0;
        return rv;
    }

    @Override
    public double getMedian() throws NoDataItemsException {
        double rv = 0.0;
        return rv;
    }

    @Override
    public double getStandardDeviation() throws NoDataItemsException {
        double rv = 0.0;
        return rv;
    }
}
