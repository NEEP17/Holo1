package com.neep.holo.domain.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="food")
@NoArgsConstructor(access= AccessLevel.PROTECTED)
public class Food {
    @Id @GeneratedValue
    private Integer food_id;
    @Column
    private String food_name;
    @Column
    private String food_img;
    @Column
    private String food_summary;
    @Column
    private String food_time;
    @Column
    private String food_level;

    /*
    @Builder
    public Food(Integer food_id, String food_name, String food_img, String food_summary, String food_time, String food_level){
        this.food_id = food_id;
        this.food_name = food_name;
        this.food_img = food_img;
        this.food_summary = food_summary;
        this.food_time = food_time;
        this.food_level = food_level;
    }
    */
}
