package es.diusframi.orionlogisticsmobile.models;

        import androidx.annotation.NonNull;
        import androidx.room.Entity;
        import androidx.room.PrimaryKey;

        import com.google.gson.annotations.SerializedName;


/**
 * Created by RicardoAveledo on 23/11/2020.
 */
@Entity(tableName = "movimientoEquipos")
public class Equipo {


    @NonNull
    @SerializedName("SERIE")
    private String serie;
    @SerializedName("PRODUCTO")
    private String producto;
    @SerializedName("DESCRIPCION")
    private String descripcion;
    @SerializedName("VARIANTE")
    private String variante;
    @SerializedName("ESTADO")
    private String estado;
    @SerializedName("DESCRIPCION_ESTADO")
    private String descripcion_estado;
    @SerializedName("COD_UBICACION")
    private String cod_ubicacion;
    @SerializedName("NOMBRE_UBICACION")
    private String nombre_ubicacion;
    @SerializedName("ALMACEN")
    private String almacen;
    @SerializedName("N_SERIE_FABRICANTE_NAV")
    private String n_serie_fabricante_nav;
    @SerializedName("CLIENTE")
    private String cliente;
    @SerializedName("ULTIMO_CAMBIO_ESTADO")
    private String ultimo_cambio_estado;
    @SerializedName("FH_GARANTIA_NAV")
    private String fh_garantia_nav;
    @SerializedName("DES_CODIGO_CIERRE")
    private String des_codigo_cierre;
    @SerializedName("TIPO_ACTUACION")
    private String tipo_actuacion;
    @SerializedName("CIRCUITO")
    private String circuito;
    @SerializedName("FECHA_ALTA")
    private String fecha_alta;
    @SerializedName("NOMBRE_ALMACEN")
    private String nombre_almacen;
    @SerializedName("RELLENO")
    private String relleno;
    @SerializedName("FECHA_REG_ULT_MOV_ALMACEN")
    private String fecha_reg_ult_mov_almacen;
    @SerializedName("V_SW")
    private String v_sw;
    @SerializedName("V_SW_PRODUCTO")
    private String v_sw_producto;
    @SerializedName("FH_VIGENCIA_SW")
    private String fh_vigencia_sw;
    @SerializedName("URL_VERSION_SW")
    private String url_version_sw;
    @SerializedName("SW_ACTUALIZADO")
    private String sw_actualizado;
    @SerializedName("NUMERO_INVENTARIO")
    private String numero_inventario;
    @SerializedName("CIRCUITO_INGENICO_COMERCIA")
    private String circuito_ingenico_comercia;
    @SerializedName("REF_CLIENTE")
    private String ref_cliente;
    @SerializedName("CODIGO_UL")
    private String codigo_ul;
    @SerializedName("SERIE_ESCANEADO")
    private int serie_escaneado;

    public Equipo(@NonNull String serie, String producto, String descripcion, String variante, String estado, String descripcion_estado, String cod_ubicacion, String nombre_ubicacion, String almacen, String n_serie_fabricante_nav, String cliente, String ultimo_cambio_estado, String fh_garantia_nav, String des_codigo_cierre, String tipo_actuacion, String circuito, String fecha_alta, String nombre_almacen, String relleno, String fecha_reg_ult_mov_almacen, String v_sw, String v_sw_producto, String fh_vigencia_sw, String url_version_sw, String sw_actualizado, String numero_inventario, String circuito_ingenico_comercia, String ref_cliente, String codigo_ul, int serie_escaneado) {
        this.serie = serie;
        this.producto = producto;
        this.descripcion = descripcion;
        this.variante = variante;
        this.estado = estado;
        this.descripcion_estado = descripcion_estado;
        this.cod_ubicacion = cod_ubicacion;
        this.nombre_ubicacion = nombre_ubicacion;
        this.almacen = almacen;
        this.n_serie_fabricante_nav = n_serie_fabricante_nav;
        this.cliente = cliente;
        this.ultimo_cambio_estado = ultimo_cambio_estado;
        this.fh_garantia_nav = fh_garantia_nav;
        this.des_codigo_cierre = des_codigo_cierre;
        this.tipo_actuacion = tipo_actuacion;
        this.circuito = circuito;
        this.fecha_alta = fecha_alta;
        this.nombre_almacen = nombre_almacen;
        this.relleno = relleno;
        this.fecha_reg_ult_mov_almacen = fecha_reg_ult_mov_almacen;
        this.v_sw = v_sw;
        this.v_sw_producto = v_sw_producto;
        this.fh_vigencia_sw = fh_vigencia_sw;
        this.url_version_sw = url_version_sw;
        this.sw_actualizado = sw_actualizado;
        this.numero_inventario = numero_inventario;
        this.circuito_ingenico_comercia = circuito_ingenico_comercia;
        this.ref_cliente = ref_cliente;
        this.codigo_ul = codigo_ul;
        this.serie_escaneado = serie_escaneado;
    }

    public int getSerie_escaneado() {
        return serie_escaneado;
    }

    public void setSerie_escaneado(int serie_escaneado) {
        this.serie_escaneado = serie_escaneado;
    }

    @NonNull
    public String getSerie() {
        return serie;
    }

    public void setSerie(@NonNull String serie) {
        this.serie = serie;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion_estado() {
        return descripcion_estado;
    }

    public void setDescripcion_estado(String descripcion_estado) {
        this.descripcion_estado = descripcion_estado;
    }

    public String getCod_ubicacion() {
        return cod_ubicacion;
    }

    public void setCod_ubicacion(String cod_ubicacion) {
        this.cod_ubicacion = cod_ubicacion;
    }

    public String getNombre_ubicacion() {
        return nombre_ubicacion;
    }

    public void setNombre_ubicacion(String nombre_ubicacion) {
        this.nombre_ubicacion = nombre_ubicacion;
    }

    public String getAlmacen() {
        return almacen;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }

    public String getN_serie_fabricante_nav() {
        return n_serie_fabricante_nav;
    }

    public void setN_serie_fabricante_nav(String n_serie_fabricante_nav) {
        this.n_serie_fabricante_nav = n_serie_fabricante_nav;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getUltimo_cambio_estado() {
        return ultimo_cambio_estado;
    }

    public void setUltimo_cambio_estado(String ultimo_cambio_estado) {
        this.ultimo_cambio_estado = ultimo_cambio_estado;
    }

    public String getFh_garantia_nav() {
        return fh_garantia_nav;
    }

    public void setFh_garantia_nav(String fh_garantia_nav) {
        this.fh_garantia_nav = fh_garantia_nav;
    }

    public String getDes_codigo_cierre() {
        return des_codigo_cierre;
    }

    public void setDes_codigo_cierre(String des_codigo_cierre) {
        this.des_codigo_cierre = des_codigo_cierre;
    }

    public String getTipo_actuacion() {
        return tipo_actuacion;
    }

    public void setTipo_actuacion(String tipo_actuacion) {
        this.tipo_actuacion = tipo_actuacion;
    }

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }

    public String getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getNombre_almacen() {
        return nombre_almacen;
    }

    public void setNombre_almacen(String nombre_almacen) {
        this.nombre_almacen = nombre_almacen;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getFecha_reg_ult_mov_almacen() {
        return fecha_reg_ult_mov_almacen;
    }

    public void setFecha_reg_ult_mov_almacen(String fecha_reg_ult_mov_almacen) {
        this.fecha_reg_ult_mov_almacen = fecha_reg_ult_mov_almacen;
    }

    public String getV_sw() {
        return v_sw;
    }

    public void setV_sw(String v_sw) {
        this.v_sw = v_sw;
    }

    public String getV_sw_producto() {
        return v_sw_producto;
    }

    public void setV_sw_producto(String v_sw_producto) {
        this.v_sw_producto = v_sw_producto;
    }

    public String getFh_vigencia_sw() {
        return fh_vigencia_sw;
    }

    public void setFh_vigencia_sw(String fh_vigencia_sw) {
        this.fh_vigencia_sw = fh_vigencia_sw;
    }

    public String getUrl_version_sw() {
        return url_version_sw;
    }

    public void setUrl_version_sw(String url_version_sw) {
        this.url_version_sw = url_version_sw;
    }

    public String getSw_actualizado() {
        return sw_actualizado;
    }

    public void setSw_actualizado(String sw_actualizado) {
        this.sw_actualizado = sw_actualizado;
    }

    public String getNumero_inventario() {
        return numero_inventario;
    }

    public void setNumero_inventario(String numero_inventario) {
        this.numero_inventario = numero_inventario;
    }

    public String getCircuito_ingenico_comercia() {
        return circuito_ingenico_comercia;
    }

    public void setCircuito_ingenico_comercia(String circuito_ingenico_comercia) {
        this.circuito_ingenico_comercia = circuito_ingenico_comercia;
    }

    public String getRef_cliente() {
        return ref_cliente;
    }

    public void setRef_cliente(String ref_cliente) {
        this.ref_cliente = ref_cliente;
    }

    public String getCodigo_ul() {
        return codigo_ul;
    }

    public void setCodigo_ul(String codigo_ul) {
        this.codigo_ul = codigo_ul;
    }
}
