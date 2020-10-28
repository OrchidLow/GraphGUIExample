import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class GraphController implements Initializable {

    @FXML
    private BarChart<?, ?> barChart;

    @FXML
    private CategoryAxis xAxis;

    @FXML
    private NumberAxis yAxis;

    private XYChart.Series colourSeries, nextYear;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // This will be the same no matter where the data is coming from
        colourSeries = new XYChart.Series();

        // sets the name of the bars in the legend
        colourSeries.setName("Favourite Colours");

        // Name the axis
        xAxis.setLabel("Colour");
        yAxis.setLabel("Number of People");

        // getData() returns an observable list, it is empty as it is new

        // adding data to colour series
        colourSeries.getData().add(new XYChart.Data("Red", 50));
        colourSeries.getData().add(new XYChart.Data("Blue", 90));
        colourSeries.getData().add(new XYChart.Data("Purple", 23));
        colourSeries.getData().add(new XYChart.Data("Green", 5));
        colourSeries.getData().add(new XYChart.Data("Pink", 67));


        // Add another data series to each category, so there will be 2 bars for each colour
        nextYear = new XYChart.Series();
        nextYear.setName("Next Year Results");
        // Adding data to nextYear
        nextYear.getData().add(new XYChart.Data("Red", 10));
        nextYear.getData().add(new XYChart.Data("Blue", 20));
        nextYear.getData().add(new XYChart.Data("Purple", 30));
        nextYear.getData().add(new XYChart.Data("Green", 40));
        nextYear.getData().add(new XYChart.Data("Pink", 50));

        // Connect to chart
        barChart.getData().addAll(colourSeries);
        barChart.getData().addAll(nextYear);

        /**
         * Looping over a hashmap to get values
         *  *** similar to adding data from a DB ****
         */
//        for (String varib: column.keySet())
//        {
//            nameofseries.getData().add(new XYChart.Data(varib, column.get(varib)));
//        }
    }
}
