/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity1.Tabel.Data.Tabel.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author LENOVO
 */
@Controller
public class TableController {
    
    @RequestMapping("/table")
    //@ResponseBody
    public String getTable(Model jne){
        String result = "Table Data Kependudukan";
        jne.addAttribute("ekspedisi", result);
        
        //DataKTP data = new DataKTP();
        ArrayList<List<String>> data = new ArrayList<>();
        
        data.add(Arrays.asList("1", "132", "1321", "Roni", "Medan"));
        data.add(Arrays.asList("2", "155", "1551", "Budi", "Balikpapan"));
        data.add(Arrays.asList("3", "183", "1831", "Imran", "Jakarta"));
        data.add(Arrays.asList("4", "196", "1961", "Dwi", "Jakpus"));
        data.add(Arrays.asList("5", "188", "1881", "Fitri", "Banten"));
        data.add(Arrays.asList("6", "105", "1005", "Nosa", "Bandung"));
        data.add(Arrays.asList("7", "166", "1661", "Adi", "Bandung"));
        data.add(Arrays.asList("8", "123", "1231", "Putri", "Bali"));
        data.add(Arrays.asList("9", "175", "1751", "Ismi", "Palu"));
        data.add(Arrays.asList("10", "145", "1451", "Tia", "Padang"));
        data.add(Arrays.asList("11", "203", "2003", "Variz", "Riau"));
        data.add(Arrays.asList("12", "256", "2561", "Alya", "Medan"));
        data.add(Arrays.asList("13", "288", "2881", "Dinda", "Palembang"));
        data.add(Arrays.asList("14", "234", "2341", "Bomag", "Palembang"));
        data.add(Arrays.asList("15", "199", "1991", "Citra", "Jambi"));
        data.add(Arrays.asList("16", "142", "1421", "Farid", "Malang"));
        data.add(Arrays.asList("17", "167", "1671", "Zaki", "Binjai"));
        data.add(Arrays.asList("18", "181", "1811", "Ilya", "Gorontalo"));
        data.add(Arrays.asList("19", "129", "1291", "Dody", "Pontianak"));
        data.add(Arrays.asList("20", "137", "1371", "Tesa", "Tarakan"));
        
        jne.addAttribute("table", data);
        
        return "tableviewer";
    }
    
}
