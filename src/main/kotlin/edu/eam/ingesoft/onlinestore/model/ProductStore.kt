package edu.eam.ingesoft.onlinestore.model

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "tbl_productos_tienda")
data class ProductStore(
    @Id
    val id: Long,

    @JoinColumn(name = "id_tienda")
    @ManyToOne
    var store: Store,

    @JoinColumn(name = "id_producto")
    @ManyToOne
    var product: Product,

    @Column(name = "cantidad")
    var stock: Int,

    @Column(name = "precio")
    var price: Double
) : Serializable
