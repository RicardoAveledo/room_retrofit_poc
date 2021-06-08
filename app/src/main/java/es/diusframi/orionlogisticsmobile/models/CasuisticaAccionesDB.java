package es.diusframi.orionlogisticsmobile.models;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by RicardoAveledo on 23/11/2020.
 */
@Entity(tableName = "casuisticaAccionesDB")
public class CasuisticaAccionesDB {

    @PrimaryKey
    @NonNull
    @SerializedName("ID_CASUISTICA_ACCIONES")
    private int id_casuistica_acciones;

    @SerializedName("TOTAL_REGISTROS")
    private String total_registros;

    @SerializedName("CLIENTE_EXCLUYENTE")
    private int cliente_excluyente;

    @SerializedName("TRABAJO_EXCLUYENTE")
    private int trabajo_excluyente;

    @SerializedName("TRABAJO")
    private int trabajo;

    @SerializedName("TIPO_TRABAJO")
    private String tipo_trabajo;

    @SerializedName("RETIRAR")
    private int retirar;

    @SerializedName("INSTALAR")
    private int instalar;

    @SerializedName("RETIRA_ADICIONAL")
    private int retira_adicional;

    @SerializedName("INSTALA_ADICIONAL")
    private int instala_adicional;

    @SerializedName("TECNOLOGIA_EXCLUYENTE")
    private int tecnologia_excluyente;

    @SerializedName("MODELO_INSTALADO_EXCLUYENTE")
    private int modelo_instalado_excluyente;

    @SerializedName("MODELO_RETIRADO_EXCLUYENTE")
    private int modelo_retirado_excluyente;

    @SerializedName("COMPONENTE_EXCLUYENTE")
    private int componente_excluyente;

    @SerializedName("CONECTIVIDAD_INSTALADO")
    private int conectividad_instalado;

    @SerializedName("CONECTIVIDAD_RETIRADO")
    private int conectividad_retirado;

    @SerializedName("CODIGO0")
    private String codigo0;

    @SerializedName("LITERAL_CODIGO0")
    private String literal_codigo0;

    @SerializedName("CODIGO")
    private String codigo;

    @SerializedName("LITERAL_CODIGO")
    private String literal_codigo;

    @SerializedName("SUBCODIGO1")
    private String subcodigo1;

    @SerializedName("LITERAL_SUBCODIGO1")
    private String literal_subcodigo1;

    @SerializedName("SUBCODIGO2")
    private String subcodigo2;

    @SerializedName("LITERAL_SUBCODIGO2")
    private String literal_subcodigo2;

    @SerializedName("SUBCODIGO3")
    private String subcodigo3;

    @SerializedName("LITERAL_SUBCODIGO3")
    private String literal_subcodigo3;

    @SerializedName("SEVERIDAD_AVERIA")
    private String severidad_averia;

    @SerializedName("SITUACION")
    private int situacion;

    @SerializedName("FIRMA")
    private int firma;

    @SerializedName("FOTO")
    private int foto;

    @SerializedName("OBSERVACIONES")
    private int observaciones;

    @SerializedName("LITERAL_OBSERVACIONES")
    private String literal_observaciones;

    @SerializedName("CARACTERES_OBSERVACIONES")
    private int caracteres_observaciones;

    @SerializedName("ADICIONAL")
    private int adicional;

    @SerializedName("LITERAL_ADICIONAL")
    private String literal_adicional;

    @SerializedName("CALENDARIO")
    private int calendario;

    @SerializedName("LITERAL_CALENDARIO")
    private String literal_calendario;

    @SerializedName("CODIGO_CIERRE")
    private int codigo_cierre;

    @SerializedName("LITERAL_CODIGO_CIERRE")
    private String literal_codigo_cierre;

    @SerializedName("LITERAL_SITUACION")
    private String literal_situacion;

    @SerializedName("TIPO_SITUACION")
    private String tipo_situacion;

    @SerializedName("ACTIVO")
    private int activo;

    @SerializedName("RETIRA_CONSUMIBLE")
    private int retira_consumible;

    @SerializedName("INSTALA_CONSUMIBLE")
    private int instala_consumible;

    @SerializedName("NUMERO_FOTOS")
    private int numero_fotos;

    @SerializedName("LITERALES_FOTOS")
    private String literales_fotos;

    public CasuisticaAccionesDB(int id_casuistica_acciones, String total_registros, int cliente_excluyente, int trabajo_excluyente, int trabajo, String tipo_trabajo, int retirar, int instalar, int retira_adicional, int instala_adicional, int tecnologia_excluyente, int modelo_instalado_excluyente, int modelo_retirado_excluyente, int componente_excluyente, int conectividad_instalado, int conectividad_retirado, String codigo0, String literal_codigo0, String codigo, String literal_codigo, String subcodigo1, String literal_subcodigo1, String subcodigo2, String literal_subcodigo2, String subcodigo3, String literal_subcodigo3, String severidad_averia, int situacion, int firma, int foto, int observaciones, String literal_observaciones, int caracteres_observaciones, int adicional, String literal_adicional, int calendario, String literal_calendario, int codigo_cierre, String literal_codigo_cierre, String literal_situacion, String tipo_situacion, int activo, int retira_consumible, int instala_consumible, int numero_fotos, String literales_fotos) {
        this.id_casuistica_acciones = id_casuistica_acciones;
        this.total_registros = total_registros;
        this.cliente_excluyente = cliente_excluyente;
        this.trabajo_excluyente = trabajo_excluyente;
        this.trabajo = trabajo;
        this.tipo_trabajo = tipo_trabajo;
        this.retirar = retirar;
        this.instalar = instalar;
        this.retira_adicional = retira_adicional;
        this.instala_adicional = instala_adicional;
        this.tecnologia_excluyente = tecnologia_excluyente;
        this.modelo_instalado_excluyente = modelo_instalado_excluyente;
        this.modelo_retirado_excluyente = modelo_retirado_excluyente;
        this.componente_excluyente = componente_excluyente;
        this.conectividad_instalado = conectividad_instalado;
        this.conectividad_retirado = conectividad_retirado;
        this.codigo0 = codigo0;
        this.literal_codigo0 = literal_codigo0;
        this.codigo = codigo;
        this.literal_codigo = literal_codigo;
        this.subcodigo1 = subcodigo1;
        this.literal_subcodigo1 = literal_subcodigo1;
        this.subcodigo2 = subcodigo2;
        this.literal_subcodigo2 = literal_subcodigo2;
        this.subcodigo3 = subcodigo3;
        this.literal_subcodigo3 = literal_subcodigo3;
        this.severidad_averia = severidad_averia;
        this.situacion = situacion;
        this.firma = firma;
        this.foto = foto;
        this.observaciones = observaciones;
        this.literal_observaciones = literal_observaciones;
        this.caracteres_observaciones = caracteres_observaciones;
        this.adicional = adicional;
        this.literal_adicional = literal_adicional;
        this.calendario = calendario;
        this.literal_calendario = literal_calendario;
        this.codigo_cierre = codigo_cierre;
        this.literal_codigo_cierre = literal_codigo_cierre;
        this.literal_situacion = literal_situacion;
        this.tipo_situacion = tipo_situacion;
        this.activo = activo;
        this.retira_consumible = retira_consumible;
        this.instala_consumible = instala_consumible;
        this.numero_fotos = numero_fotos;
        this.literales_fotos = literales_fotos;
    }

    public int getId_casuistica_acciones() {
        return id_casuistica_acciones;
    }

    public void setId_casuistica_acciones(int id_casuistica_acciones) {
        this.id_casuistica_acciones = id_casuistica_acciones;
    }

    public String getTotal_registros() {
        return total_registros;
    }

    public void setTotal_registros(String total_registros) {
        this.total_registros = total_registros;
    }

    public int getCliente_excluyente() {
        return cliente_excluyente;
    }

    public void setCliente_excluyente(int cliente_excluyente) {
        this.cliente_excluyente = cliente_excluyente;
    }

    public int getTrabajo_excluyente() {
        return trabajo_excluyente;
    }

    public void setTrabajo_excluyente(int trabajo_excluyente) {
        this.trabajo_excluyente = trabajo_excluyente;
    }

    public int getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(int trabajo) {
        this.trabajo = trabajo;
    }

    public String getTipo_trabajo() {
        return tipo_trabajo;
    }

    public void setTipo_trabajo(String tipo_trabajo) {
        this.tipo_trabajo = tipo_trabajo;
    }

    public int getRetirar() {
        return retirar;
    }

    public void setRetirar(int retirar) {
        this.retirar = retirar;
    }

    public int getInstalar() {
        return instalar;
    }

    public void setInstalar(int instalar) {
        this.instalar = instalar;
    }

    public int getRetira_adicional() {
        return retira_adicional;
    }

    public void setRetira_adicional(int retira_adicional) {
        this.retira_adicional = retira_adicional;
    }

    public int getInstala_adicional() {
        return instala_adicional;
    }

    public void setInstala_adicional(int instala_adicional) {
        this.instala_adicional = instala_adicional;
    }

    public int getTecnologia_excluyente() {
        return tecnologia_excluyente;
    }

    public void setTecnologia_excluyente(int tecnologia_excluyente) {
        this.tecnologia_excluyente = tecnologia_excluyente;
    }

    public int getModelo_instalado_excluyente() {
        return modelo_instalado_excluyente;
    }

    public void setModelo_instalado_excluyente(int modelo_instalado_excluyente) {
        this.modelo_instalado_excluyente = modelo_instalado_excluyente;
    }

    public int getModelo_retirado_excluyente() {
        return modelo_retirado_excluyente;
    }

    public void setModelo_retirado_excluyente(int modelo_retirado_excluyente) {
        this.modelo_retirado_excluyente = modelo_retirado_excluyente;
    }

    public int getComponente_excluyente() {
        return componente_excluyente;
    }

    public void setComponente_excluyente(int componente_excluyente) {
        this.componente_excluyente = componente_excluyente;
    }

    public int getConectividad_instalado() {
        return conectividad_instalado;
    }

    public void setConectividad_instalado(int conectividad_instalado) {
        this.conectividad_instalado = conectividad_instalado;
    }

    public int getConectividad_retirado() {
        return conectividad_retirado;
    }

    public void setConectividad_retirado(int conectividad_retirado) {
        this.conectividad_retirado = conectividad_retirado;
    }

    public String getCodigo0() {
        return codigo0;
    }

    public void setCodigo0(String codigo0) {
        this.codigo0 = codigo0;
    }

    public String getLiteral_codigo0() {
        return literal_codigo0;
    }

    public void setLiteral_codigo0(String literal_codigo0) {
        this.literal_codigo0 = literal_codigo0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLiteral_codigo() {
        return literal_codigo;
    }

    public void setLiteral_codigo(String literal_codigo) {
        this.literal_codigo = literal_codigo;
    }

    public String getSubcodigo1() {
        return subcodigo1;
    }

    public void setSubcodigo1(String subcodigo1) {
        this.subcodigo1 = subcodigo1;
    }

    public String getLiteral_subcodigo1() {
        return literal_subcodigo1;
    }

    public void setLiteral_subcodigo1(String literal_subcodigo1) {
        this.literal_subcodigo1 = literal_subcodigo1;
    }

    public String getSubcodigo2() {
        return subcodigo2;
    }

    public void setSubcodigo2(String subcodigo2) {
        this.subcodigo2 = subcodigo2;
    }

    public String getLiteral_subcodigo2() {
        return literal_subcodigo2;
    }

    public void setLiteral_subcodigo2(String literal_subcodigo2) {
        this.literal_subcodigo2 = literal_subcodigo2;
    }

    public String getSubcodigo3() {
        return subcodigo3;
    }

    public void setSubcodigo3(String subcodigo3) {
        this.subcodigo3 = subcodigo3;
    }

    public String getLiteral_subcodigo3() {
        return literal_subcodigo3;
    }

    public void setLiteral_subcodigo3(String literal_subcodigo3) {
        this.literal_subcodigo3 = literal_subcodigo3;
    }

    public String getSeveridad_averia() {
        return severidad_averia;
    }

    public void setSeveridad_averia(String severidad_averia) {
        this.severidad_averia = severidad_averia;
    }

    public int getSituacion() {
        return situacion;
    }

    public void setSituacion(int situacion) {
        this.situacion = situacion;
    }

    public int getFirma() {
        return firma;
    }

    public void setFirma(int firma) {
        this.firma = firma;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(int observaciones) {
        this.observaciones = observaciones;
    }

    public String getLiteral_observaciones() {
        return literal_observaciones;
    }

    public void setLiteral_observaciones(String literal_observaciones) {
        this.literal_observaciones = literal_observaciones;
    }

    public int getCaracteres_observaciones() {
        return caracteres_observaciones;
    }

    public void setCaracteres_observaciones(int caracteres_observaciones) {
        this.caracteres_observaciones = caracteres_observaciones;
    }

    public int getAdicional() {
        return adicional;
    }

    public void setAdicional(int adicional) {
        this.adicional = adicional;
    }

    public String getLiteral_adicional() {
        return literal_adicional;
    }

    public void setLiteral_adicional(String literal_adicional) {
        this.literal_adicional = literal_adicional;
    }

    public int getCalendario() {
        return calendario;
    }

    public void setCalendario(int calendario) {
        this.calendario = calendario;
    }

    public String getLiteral_calendario() {
        return literal_calendario;
    }

    public void setLiteral_calendario(String literal_calendario) {
        this.literal_calendario = literal_calendario;
    }

    public int getCodigo_cierre() {
        return codigo_cierre;
    }

    public void setCodigo_cierre(int codigo_cierre) {
        this.codigo_cierre = codigo_cierre;
    }

    public String getLiteral_codigo_cierre() {
        return literal_codigo_cierre;
    }

    public void setLiteral_codigo_cierre(String literal_codigo_cierre) {
        this.literal_codigo_cierre = literal_codigo_cierre;
    }

    public String getLiteral_situacion() {
        return literal_situacion;
    }

    public void setLiteral_situacion(String literal_situacion) {
        this.literal_situacion = literal_situacion;
    }

    public String getTipo_situacion() {
        return tipo_situacion;
    }

    public void setTipo_situacion(String tipo_situacion) {
        this.tipo_situacion = tipo_situacion;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public int getRetira_consumible() {
        return retira_consumible;
    }

    public void setRetira_consumible(int retira_consumible) {
        this.retira_consumible = retira_consumible;
    }

    public int getInstala_consumible() {
        return instala_consumible;
    }

    public void setInstala_consumible(int instala_consumible) {
        this.instala_consumible = instala_consumible;
    }

    public int getNumero_fotos() {
        return numero_fotos;
    }

    public void setNumero_fotos(int numero_fotos) {
        this.numero_fotos = numero_fotos;
    }

    public String getLiterales_fotos() {
        return literales_fotos;
    }

    public void setLiterales_fotos(String literales_fotos) {
        this.literales_fotos = literales_fotos;
    }

    public static List<CasuisticaAccionesDB> convert(List<CasuisticaAcciones> casuisticaAcciones){
        List<CasuisticaAccionesDB> casuisticaAccionesDBlist = new ArrayList<>();
        for(int y=0; y<casuisticaAcciones.size(); y++) {
            try {
                CasuisticaAccionesDB casuisticaAccionesDB =
                        new CasuisticaAccionesDB(Integer.parseInt(casuisticaAcciones.get(y).getId_casuistica_acciones()),
                                casuisticaAcciones.get(y).getTotal_registros(),
                                Integer.parseInt(casuisticaAcciones.get(y).getCliente_excluyente()),
                                Integer.parseInt(casuisticaAcciones.get(y).getTrabajo_excluyente()),
                                Integer.parseInt(casuisticaAcciones.get(y).getTrabajo()),
                                casuisticaAcciones.get(y).getTipo_trabajo(),
                                Integer.parseInt(casuisticaAcciones.get(y).getRetirar()),
                                Integer.parseInt(casuisticaAcciones.get(y).getInstalar()),
                                Integer.parseInt(casuisticaAcciones.get(y).getRetira_adicional()),
                                Integer.parseInt(casuisticaAcciones.get(y).getInstala_adicional()),
                                Integer.parseInt(casuisticaAcciones.get(y).getTecnologia_excluyente()),
                                Integer.parseInt(casuisticaAcciones.get(y).getModelo_instalado_excluyente()),
                                Integer.parseInt(casuisticaAcciones.get(y).getModelo_retirado_excluyente()),
                                Integer.parseInt(casuisticaAcciones.get(y).getComponente_excluyente()),
                                Integer.parseInt(casuisticaAcciones.get(y).getConectividad_instalado()),
                                Integer.parseInt(casuisticaAcciones.get(y).getConectividad_retirado()),
                                casuisticaAcciones.get(y).getCodigo0(),
                                casuisticaAcciones.get(y).getLiteral_codigo0(),
                                casuisticaAcciones.get(y).getCodigo(),
                                casuisticaAcciones.get(y).getLiteral_codigo(),
                                casuisticaAcciones.get(y).getSubcodigo1(),
                                casuisticaAcciones.get(y).getLiteral_subcodigo1(),
                                casuisticaAcciones.get(y).getSubcodigo2(),
                                casuisticaAcciones.get(y).getLiteral_subcodigo2(),
                                casuisticaAcciones.get(y).getSubcodigo3(),
                                casuisticaAcciones.get(y).getLiteral_subcodigo3(),
                                casuisticaAcciones.get(y).getSeveridad_averia().toUpperCase(),
                                Integer.parseInt(casuisticaAcciones.get(y).getSituacion()),
                                Integer.parseInt(casuisticaAcciones.get(y).getFirma()),
                                Integer.parseInt(casuisticaAcciones.get(y).getFoto()),
                                Integer.parseInt(casuisticaAcciones.get(y).getObservaciones()),
                                casuisticaAcciones.get(y).getLiteral_observaciones(),
                                Integer.parseInt(casuisticaAcciones.get(y).getCaracteres_observaciones()),
                                Integer.parseInt(casuisticaAcciones.get(y).getAdicional()),
                                casuisticaAcciones.get(y).getLiteral_adicional(),
                                Integer.parseInt(casuisticaAcciones.get(y).getCalendario()),
                                casuisticaAcciones.get(y).getLiteral_calendario(),
                                Integer.parseInt(casuisticaAcciones.get(y).getCodigo_cierre()),
                                casuisticaAcciones.get(y).getLiteral_codigo_cierre(),
                                casuisticaAcciones.get(y).getLiteral_situacion(),
                                casuisticaAcciones.get(y).getTipo_situacion(),
                                Integer.parseInt(casuisticaAcciones.get(y).getActivo()),
                                Integer.parseInt(casuisticaAcciones.get(y).getRetira_consumible()),
                                Integer.parseInt(casuisticaAcciones.get(y).getInstala_consumible()),
                                Integer.parseInt(casuisticaAcciones.get(y).getNumero_fotos()),
                                casuisticaAcciones.get(y).getLiterales_fotos());
                casuisticaAccionesDBlist.add(casuisticaAccionesDB);
            } catch (Exception e) {
                Log.d("ACTUALIZANDOCASUISTICAS","DB FALLÓ "+y+"");
                e.printStackTrace();
            }
            Log.d("ACTUALIZANDOCASUISTICAS","DB "+y+"");
        }
        return casuisticaAccionesDBlist;
    }
}
