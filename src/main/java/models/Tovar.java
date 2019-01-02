package models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode

public class Tovar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String name;
    private  String about;
    private int price;

    public Tovar(String name, String about, int price) {
        this.name = name;
        this.about = about;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Tovar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                ", price=" + price +
                '}';
    }


}
