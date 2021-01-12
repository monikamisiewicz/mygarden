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
@Table(name = "bloom_time")
public class BloomTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "month")
    private String month;

    @ManyToMany(mappedBy = "bloomTimes")
    private Set<Plant> plants = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BloomTime bloomTime = (BloomTime) o;
        return Objects.equals(id, bloomTime.id) &&
                Objects.equals(month, bloomTime.month) &&
                Objects.equals(plants, bloomTime.plants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, month, plants);
    }

    @Override
    public String toString() {
        return "BloomTime{" +
                "id=" + id +
                ", month='" + month + '\'' +
                ", plants=" + plants +
                '}';
    }
}
