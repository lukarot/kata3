package kata3;
import java.awt.Dimension;
import org.jfree.ui.ApplicationFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay() {
        super("histograma");
        setContentPane(createPanel());
        pack();
    }
    public void execute(){
        setVisible(true);
    }
    private JPanel createPanel(){
        ChartPanel chartPanel=new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(400,500));
        return chartPanel;
    }
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart=ChartFactory.createBarChart(
                "titulo", 
                "dominio email", 
                "número de email", 
                dataSet, 
                PlotOrientation.VERTICAL, 
                false, 
                rootPaneCheckingEnabled, 
                rootPaneCheckingEnabled
                );
        return chart;
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet=new DefaultCategoryDataset();
        dataSet.addValue(5, "", "gmail.com");
        dataSet.addValue(10, "", "ulpgc.es");
        dataSet.addValue(8, "", "ull.es");
        dataSet.addValue(2, "", "hotmail.com");
        return dataSet;    
    }
    
}