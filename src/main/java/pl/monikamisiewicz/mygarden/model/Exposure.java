package pl.monikamisiewicz.mygarden.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "exposure")
public class Exposure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

//    @ManyToMany(mappedBy = "exposures")
//    private Set<Plant> plants = new HashSet<>();
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Exposure exposure = (Exposure) o;
//        return Objects.equals(id, exposure.id) &&
//                Objects.equals(name, exposure.name) &&
//                Objects.equals(plants, exposure.plants);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, plants);
//    }
//
//    @Override
//    public String toString() {
//        return "Exposure{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", plants=" + plants +
//                '}';
//    }
}
