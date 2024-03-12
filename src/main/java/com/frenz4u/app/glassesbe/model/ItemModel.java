package com.frenz4u.app.glassesbe.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.Instant;

@Table(name = "tb_item")
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
public class ItemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id", nullable = false)
    private Integer itemId;

    @Column(name = "brand")
    private String brand;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "origin_price")
    private String originPrice;

    @Column(name = "sale_price")
    private String salePrice;

    @Column(name = "size_specs")
    private String sizeSpecs;

    @Column(name = "shape_specs")
    private String shapeSpecs;

    @Column(name = "material_specs")
    private String materialSpecs;

    @Column(name = "color_specs")
    private String colorSpecs;

    @Column(name = "structure_specs")
    private String structureSpecs;

    @Column(name = "details")
    private String details;

    @Column(name = "register_id")
    private String registerId;

    @Column(name = "use_fg")
    @Builder.Default
    private Boolean useFlag = true;

    @EqualsAndHashCode.Exclude
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    @Column(name = "created_at")
    private Instant createdAt;

    @EqualsAndHashCode.Exclude
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    @Column(name = "updated_at")
    private Instant updatedAt;
}
