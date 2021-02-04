package com.codegym.airbnb.model.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "rooms")

public class Room implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String address;
    private Double pricePerNight;
    private Byte totalOfBedroom;
    private Byte totalOfBathroom;
    private Boolean status;

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
    private List<RoomImage> roomImages;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = true, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "province_id", nullable = true, updatable = false)
    private Province province;

    @ManyToOne
    @JoinColumn(name = "property_type", nullable = true, updatable = false)
    private PropertyType propertyType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(Double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public Byte getTotalOfBedroom() {
        return totalOfBedroom;
    }

    public void setTotalOfBedroom(Byte totalOfBedroom) {
        this.totalOfBedroom = totalOfBedroom;
    }

    public Byte getTotalOfBathroom() {
        return totalOfBathroom;
    }

    public void setTotalOfBathroom(Byte totalOfBathroom) {
        this.totalOfBathroom = totalOfBathroom;
    }

    public List<RoomImage> getBookingImages() {
        return roomImages;
    }

    public void setBookingImages(List<RoomImage> roomImages) {
        this.roomImages = roomImages;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<RoomImage> getRoomImages() {
        return roomImages;
    }

    public void setRoomImages(List<RoomImage> roomImages) {
        this.roomImages = roomImages;
    }
}
