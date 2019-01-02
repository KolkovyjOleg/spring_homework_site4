package Controller;

import DAO.TovarDAO;
import models.Tovar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private TovarDAO tovarDAO;


    @GetMapping("/")
    public String index(){
        return "index.html";
    }

    @GetMapping("/saveDB")
    public String saveDB(Model model) {
        System.out.println("write");
        for (int i = 0; i < 20; i++) {
            tovarDAO.save(new Tovar("Tovar " + i, "best tovar " + i, i * 100));
            System.out.println("write "+i);
        }
        return "saveDB.html";
    }

        @GetMapping("/output")
        public String output(Model model){

            tovarDAO.findAll();
            model.addAttribute("tovars", tovarDAO.findAll());
            return "output.html";
        }




//
//    @PostMapping
//    public String save(@RequestParam("data") String data, Model model){
//
//       // userDAO.save(new User(data));
//       // model.addAttribute("data",data);
//        return "index1.html";
//    }
}
