package edu.eam.ingesoft.onlinestore.model

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "tbl_products")
data class Product(
    @Id
    @Column(name = "id_producto")
    val id: String,

    @Column(name = "nombre")
    var name: String,

    @Column(name = "marca")
    var branch: String,

    @JoinColumn(name = "id_categoria")
    @ManyToOne
    var category: Category,
) : Serializable
