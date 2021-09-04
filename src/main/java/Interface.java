// Packages to import
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Interface {
    // frame
    JFrame f;
    // Table
    JTable j;

    // Constructor
    Interface(List<Character> characters)
    {
        // Frame initiallization
        f = new JFrame();

        // Frame Title
        f.setTitle("JTable");
        // Data to be displayed in the JTable
        String[][] data = new String[characters.size()][3];
        for(int i=0; i< characters.size(); i++){
            data[i][0] = characters.get(i).getName();
            data[i][1] = characters.get(i).getHeight();
            data[i][2] = characters.get(i).getBirth_year();
        }

        // Column Names
        String[] columnNames = { "Nombre", "Altura", "Año Nacimiento" };

        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);

        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(500, 200);
        // Frame Visible = true
        f.setVisible(true);
    }
}
