package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_partes")
public class DiusPartesDB {

    @PrimaryKey
    @NonNull
    @SerializedName("idparte") //Este campo es de tipo nvarchar(11)
    private String idparte;

    //Este campo es de tipo nvarchar(50)
    @SerializedName("scliente")
    private String scliente;

    //Este campo es de tipo nvarchar(25)
    @SerializedName("strabajo")
    private String strabajo;

    //Este campo es de tipo nvarchar(50)
    @SerializedName("slocalidad")
    private String slocalidad;

    //Este campo es de tipo nvarchar(50)
    @SerializedName("sdireccion")
    private String sdireccion;

    //Este campo es de tipo nvarchar(20)
    @SerializedName("dtiempolimite")
    private String dtiempolimite;

    //Este campo es de tipo nvarchar(15)
    @SerializedName("snumaveria")
    private String snumaveria;

    //Este campo es de tipo nvarchar(20)
    @SerializedName("dentrada")
    private String dentrada;

    //Este campo es de tipo nvarchar(15)
    @SerializedName("scomercio")
    private String scomercio;

    //Este campo es de tipo nvarchar(25)
    @SerializedName("sdenominacion")
    private String sdenominacion;

    //Este campo es de tipo nvarchar(7)
    @SerializedName("scp")
    private String scp;

    //Este campo es de tipo nvarchar(15)
    @SerializedName("stel1")
    private String stel1;

    //Este campo es de tipo nvarchar(15)
    @SerializedName("stel2")
    private String stel2;

    //Este campo es de tipo nvarchar(30)
    @SerializedName("shorario")
    private String shorario;

    //Este campo es de tipo nvarchar(40)
    @SerializedName("scontacto")
    private String scontacto;

    //Este campo es de tipo nvarchar(55)
    @SerializedName("serrorcliente")
    private String serrorcliente;

    //Este campo es de tipo nvarchar(150)
    @SerializedName("sincidencia")
    private String sincidencia;

    //Este campo es de tipo nvarchar(50)
    @SerializedName("smodelodis")
    private String smodelodis;

    //Este campo es de tipo nvarchar(50)
    @SerializedName("snumseriedis")
    private String snumseriedis;

    //Este campo es de tipo nvarchar(250)
    @SerializedName("saveriadetectada")
    private String saveriadetectada;

    //Este campo es de tipo nvarchar(9)
    @SerializedName("sfax")
    private String sfax;

    //Este campo es de tipo nvarchar(100)
    @SerializedName("smail")
    private String smail;

    @SerializedName("iestado")
    private int iestado;

    //Este campo es de tipo ntext
    @SerializedName("sfirmat")
    private String sfirmat;

    //Este campo es de tipo ntext
    @SerializedName("sfirma")
    private String sfirma;

    @SerializedName("iwf")
    private int iwf;

    @SerializedName("ihf")
    private int ihf;

    @SerializedName("iwft")
    private int iwft;

    @SerializedName("ihft")
    private int ihft;

    //Este campo es de tipo nvarchar(15)
    @SerializedName("spass")
    private String spass;

    //Este campo es de tipo nvarchar(255)
    @SerializedName("p1")
    private String p1;

    //Este campo es de tipo nvarchar(255)
    @SerializedName("p2")
    private String p2;

    //Este campo es de tipo nvarchar(255)
    @SerializedName("p3")
    private String p3;

    //Este campo es de tipo nvarchar(255)
    @SerializedName("p4")
    private String p4;

    //Este campo es de tipo nvarchar(255)
    @SerializedName("p5")
    private String p5;

    //Este campo es de tipo nvarchar(255)
    @SerializedName("p6")
    private String p6;

    //Este campo es de tipo nvarchar(255)
    @SerializedName("p7")
    private String p7;

    //Este campo es de tipo nvarchar(255)
    @SerializedName("p8")
    private String p8;

    //Este campo es de tipo nvarchar(255)
    @SerializedName("p9")
    private String p9;

    //Este campo es de tipo nvarchar(255)
    @SerializedName("p10")
    private String p10;

    //Este campo es de tipo nvarchar(255)
    @SerializedName("p11")
    private String p11;

    //Este campo es de tipo nvarchar(255)
    @SerializedName("p12")
    private String p12;

    //Este campo es de tipo nvarchar(255)
    @SerializedName("p13")
    private String p13;

    //Este campo es de tipo nvarchar(255)
    @SerializedName("p14")
    private String p14;

    //Este campo es de tipo nvarchar(255)
    @SerializedName("p15")
    private String p15;

    // Este campo es DATETIME hay que hacer un typeConverter
    @SerializedName("dfechainicio")
    private String dfechainicio;

    // Este campo es DATETIME hay que hacer un typeConverter
    @SerializedName("dfechafin")
    private String dfechafin;

    //Este campo es de tipo tinyint
    @SerializedName("itipores")
    private int itipores;

    //Este campo es de tipo nvarchar(255)
    @SerializedName("sobservaciones")
    private String sobservaciones;

    //Este campo es de tipo nvarchar(255)
    @SerializedName("sincidenciares")
    private String sincidenciares;

    //Este campo es de tipo nvarchar(100)
    @SerializedName("serrorcons")
    private String serrorcons;

    //Este campo es de tipo tinyint
    @SerializedName("r1")
    private int r1;

    //Este campo es de tipo tinyint
    @SerializedName("r2")
    private int r2;

    //Este campo es de tipo tinyint
    @SerializedName("r3")
    private int r3;

    //Este campo es de tipo tinyint
    @SerializedName("r4")
    private int r4;

    //Este campo es de tipo tinyint
    @SerializedName("r5")
    private int r5;

    //Este campo es de tipo tinyint
    @SerializedName("r6")
    private int r6;

    //Este campo es de tipo tinyint
    @SerializedName("r7")
    private int r7;

    //Este campo es de tipo tinyint
    @SerializedName("r8")
    private int r8;

    //Este campo es de tipo tinyint
    @SerializedName("r9")
    private int r9;

    //Este campo es de tipo tinyint
    @SerializedName("r10")
    private int r10;

    //Este campo es de tipo tinyint
    @SerializedName("r11")
    private int r11;

    //Este campo es de tipo tinyint
    @SerializedName("r12")
    private int r12;

    //Este campo es de tipo tinyint
    @SerializedName("r13")
    private int r13;

    //Este campo es de tipo tinyint
    @SerializedName("r14")
    private int r14;

    //Este campo es de tipo tinyint
    @SerializedName("r15")
    private int r15;

    //Este campo es de tipo nvarchar(4)
    @SerializedName("scliente_r")
    private String scliente_r;

    //Este campo es de tipo nvarchar(4)
    @SerializedName("strabajo_r")
    private String strabajo_r;

    //Este campo es de tipo nvarchar(11)
    @SerializedName("slimite_r")
    private String slimite_r;

    //Este campo es de tipo nvarchar(4)
    @SerializedName("scoderrorcliente")
    private String scoderrorcliente;

    //Este campo es de tipo nvarchar(20)
    @SerializedName("scodtpvdis")
    private String scodtpvdis;

    //Este campo es de tipo nvarchar(50)
    @SerializedName("smodelotpv_i")
    private String smodelotpv_i;

    //Este campo es de tipo nvarchar(50)
    @SerializedName("snumserietpv_i")
    private String snumserietpv_i;

    //Este campo es de tipo nvarchar(20)
    @SerializedName("scodtpv_i")
    private String scodtpv_i;

    //Este campo es de tipo nvarchar(15)
    @SerializedName("spasstpv_i")
    private String spasstpv_i;

    //Este campo es de tipo nvarchar(20)
    @SerializedName("sprovincia")
    private String sprovincia;

    //Este campo es de tipo nvarchar(50)
    @SerializedName("scia")
    private String scia;

    //Este campo es de tipo nvarchar(10)
    @SerializedName("slocalidad_r")
    private String slocalidad_r;

    //Este campo es de tipo nvarchar(20)
    @SerializedName("ssim")
    private String ssim;

    @SerializedName("scobm")
    private int scobm;

    @SerializedName("scobv")
    private int scobv;

    @SerializedName("scobo")
    private int scobo;

    //Este campo es de tipo nvarchar(20)
    @SerializedName("openlat")
    private String openlat;

    //Este campo es de tipo nvarchar(20)
    @SerializedName("openlong")
    private String openlong;

    // Este campo es DATETIME hay que hacer un typeConverter
    @SerializedName("opendate")
    private String opendate;

    //Este campo es de tipo nvarchar(20)
    @SerializedName("finlat")
    private String finlat;

    //Este campo es de tipo nvarchar(20)
    @SerializedName("finlong")
    private String finlong;

    // Este campo es DATETIME hay que hacer un typeConverter
    @SerializedName("datefin")
    private String datefin;

    //Este campo es de tipo nvarchar(255)
    @SerializedName("sfirmadopor")
    private String sfirmadopor;

    // Este campo es DATETIME hay que hacer un typeConverter
    @SerializedName("dlimiteorden")
    private String dlimiteorden;

    @SerializedName("orden_tecnico")
    private int orden_tecnico;

    //Este campo es de tipo nvarchar(20)
    @SerializedName("longitude")
    private String longitude;

    //Este campo es de tipo nvarchar(20)
    @SerializedName("latitude")
    private String latitude;

    //Este campo es de tipo nvarchar(50)
    @SerializedName("stellong")
    private String stellong;

    //Este campo es de tipo nvarchar(10)
    @SerializedName("tipo_trabajo")
    private String tipo_trabajo;

    @SerializedName("codigo_cliente")
    private int codigo_cliente;

    //Este campo es de tipo nvarchar(250)
    @SerializedName("encuesta_id")
    private String encuesta_id;

    //Este campo es de tipo nvarchar(250)
    @SerializedName("encuesta_texto")
    private String encuesta_texto;

    //Este campo es de tipo nvarchar(250)
    @SerializedName("encuesta_tipovaloracion")
    private String encuesta_tipovaloracion;

    //Este campo es de tipo nvarchar(250)
    @SerializedName("encuesta_requiereobs")
    private String encuesta_requiereobs;

    //Este campo es de tipo nvarchar(250)
    @SerializedName("encuesta_opciones")
    private String encuesta_opciones;

    //Este campo es de tipo nvarchar(250)
    @SerializedName("encuesta_calendario")
    private String encuesta_calendario;

    //Este campo es de tipo nvarchar(250)
    @SerializedName("encuesta_quizresult")
    private String encuesta_quizresult;

    //Este campo es de tipo nvarchar(30)
    @SerializedName("horas_restantes")
    private String horas_restantes;

    //Este campo es de tipo nvarchar(30)
    @SerializedName("complemento_direccion")
    private String complemento_direccion;

    //Este campo es de tipo nvarchar(30)
    @SerializedName("nombre_rotulo")
    private String nombre_rotulo;

    //Este campo es de tipo nvarchar(30)
    @SerializedName("email")
    private String email;

    //Este campo es de tipo nvarchar(30)
    @SerializedName("horario_contacto")
    private String horario_contacto;

    //Este campo es de tipo nvarchar(30)
    @SerializedName("telefonos")
    private String telefonos;

    @SerializedName("contacto_telefonico")
    private String contacto_telefonico;

    @SerializedName("tel_sat_entidad")
    private String tel_sat_entidad;

    @SerializedName("tel_sat_compañia")
    private String tel_sat_compañia;

    @SerializedName("saveriadetectadaID")
    private String saveriadetectadaID;

    @SerializedName("estado_img")
    private String estado_img;

    @SerializedName("fh_cita")
    private String fh_cita;

    @SerializedName("actividad")
    private String actividad;

    @SerializedName("des_sector_avitidad")
    private String des_sector_avitidad;

    @SerializedName("cli_potential_vida")
    private int cli_potential_vida;

    @SerializedName("contenido_vida")
    private String contenido_vida;

    @SerializedName("idmaterial_c")
    private String idmaterial_c;

    @SerializedName("idmaterial_i")
    private String idmaterial_i;

    @SerializedName("idcompania")
    private int idcompania;

    @SerializedName("fotos_casuistica")
    private String fotos_casuistica;

    @SerializedName("equipos_comercio")
    private String equipos_comercio;

    @SerializedName("casuistica_materiales")
    private String casuistica_materiales;

    @SerializedName("casuistica_acciones")
    private String casuistica_acciones;

    @SerializedName("id_casuistica_materiales_final")
    private int id_casuistica_materiales_final;

    @SerializedName("id_casuistica_acciones_final")
    private int id_casuistica_acciones_final;

    @SerializedName("idtrabajo")
    private int idtrabajo;

    @SerializedName("generico_instalar")
    private int generico_instalar;

    @SerializedName("informacion_adicional")
    private String informacion_adicional;

    @SerializedName("tipo_documento")
    private int tipo_documento;

    @SerializedName("numero_documento")
    private String numero_documento;

    @SerializedName("mat_propio")
    private int mat_propio;

    @SerializedName("cliente_compania")
    private int cliente_compania;

    @SerializedName("cod_producto_tpv_c")
    private String cod_producto_tpv_c;

    @SerializedName("fungibles_permitidos")
    private String fungibles_permitidos;

    @SerializedName("autoconsumo_consumibles")
    private int autoconsumo_consumibles;

    @SerializedName("serrorcallcenter")
    private String serrorcallcenter;

    //CONSTRAINT "PK__dius_partes__0000000000000135" PRIMARY KEY("idparte")


    public DiusPartesDB(@NonNull String idparte, String scliente, String strabajo, String slocalidad, String sdireccion, String dtiempolimite, String snumaveria, String dentrada, String scomercio, String sdenominacion, String scp, String stel1, String stel2, String shorario, String scontacto, String serrorcliente, String sincidencia, String smodelodis, String snumseriedis, String saveriadetectada, String sfax, String smail, int iestado, String sfirmat, String sfirma, int iwf, int ihf, int iwft, int ihft, String spass, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String dfechainicio, String dfechafin, int itipores, String sobservaciones, String sincidenciares, String serrorcons, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, String scliente_r, String strabajo_r, String slimite_r, String scoderrorcliente, String scodtpvdis, String smodelotpv_i, String snumserietpv_i, String scodtpv_i, String spasstpv_i, String sprovincia, String scia, String slocalidad_r, String ssim, int scobm, int scobv, int scobo, String openlat, String openlong, String opendate, String finlat, String finlong, String datefin, String sfirmadopor, String dlimiteorden, int orden_tecnico, String longitude, String latitude, String stellong, String tipo_trabajo, int codigo_cliente, String encuesta_id, String encuesta_texto, String encuesta_tipovaloracion, String encuesta_requiereobs, String encuesta_opciones, String encuesta_calendario, String encuesta_quizresult, String horas_restantes, String complemento_direccion, String nombre_rotulo, String email, String horario_contacto, String telefonos, String contacto_telefonico, String tel_sat_entidad, String tel_sat_compañia, String saveriadetectadaID, String estado_img, String fh_cita, String actividad, String des_sector_avitidad, int cli_potential_vida, String contenido_vida, String idmaterial_c, String idmaterial_i, int idcompania, String fotos_casuistica, String equipos_comercio, String casuistica_materiales, String casuistica_acciones, int id_casuistica_materiales_final, int id_casuistica_acciones_final, int idtrabajo, int generico_instalar, String informacion_adicional, int tipo_documento, String numero_documento, int mat_propio, int cliente_compania, String cod_producto_tpv_c, String fungibles_permitidos, int autoconsumo_consumibles, String serrorcallcenter) {
        this.idparte = idparte;
        this.scliente = scliente;
        this.strabajo = strabajo;
        this.slocalidad = slocalidad;
        this.sdireccion = sdireccion;
        this.dtiempolimite = dtiempolimite;
        this.snumaveria = snumaveria;
        this.dentrada = dentrada;
        this.scomercio = scomercio;
        this.sdenominacion = sdenominacion;
        this.scp = scp;
        this.stel1 = stel1;
        this.stel2 = stel2;
        this.shorario = shorario;
        this.scontacto = scontacto;
        this.serrorcliente = serrorcliente;
        this.sincidencia = sincidencia;
        this.smodelodis = smodelodis;
        this.snumseriedis = snumseriedis;
        this.saveriadetectada = saveriadetectada;
        this.sfax = sfax;
        this.smail = smail;
        this.iestado = iestado;
        this.sfirmat = sfirmat;
        this.sfirma = sfirma;
        this.iwf = iwf;
        this.ihf = ihf;
        this.iwft = iwft;
        this.ihft = ihft;
        this.spass = spass;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
        this.p7 = p7;
        this.p8 = p8;
        this.p9 = p9;
        this.p10 = p10;
        this.p11 = p11;
        this.p12 = p12;
        this.p13 = p13;
        this.p14 = p14;
        this.p15 = p15;
        this.dfechainicio = dfechainicio;
        this.dfechafin = dfechafin;
        this.itipores = itipores;
        this.sobservaciones = sobservaciones;
        this.sincidenciares = sincidenciares;
        this.serrorcons = serrorcons;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.r4 = r4;
        this.r5 = r5;
        this.r6 = r6;
        this.r7 = r7;
        this.r8 = r8;
        this.r9 = r9;
        this.r10 = r10;
        this.r11 = r11;
        this.r12 = r12;
        this.r13 = r13;
        this.r14 = r14;
        this.r15 = r15;
        this.scliente_r = scliente_r;
        this.strabajo_r = strabajo_r;
        this.slimite_r = slimite_r;
        this.scoderrorcliente = scoderrorcliente;
        this.scodtpvdis = scodtpvdis;
        this.smodelotpv_i = smodelotpv_i;
        this.snumserietpv_i = snumserietpv_i;
        this.scodtpv_i = scodtpv_i;
        this.spasstpv_i = spasstpv_i;
        this.sprovincia = sprovincia;
        this.scia = scia;
        this.slocalidad_r = slocalidad_r;
        this.ssim = ssim;
        this.scobm = scobm;
        this.scobv = scobv;
        this.scobo = scobo;
        this.openlat = openlat;
        this.openlong = openlong;
        this.opendate = opendate;
        this.finlat = finlat;
        this.finlong = finlong;
        this.datefin = datefin;
        this.sfirmadopor = sfirmadopor;
        this.dlimiteorden = dlimiteorden;
        this.orden_tecnico = orden_tecnico;
        this.longitude = longitude;
        this.latitude = latitude;
        this.stellong = stellong;
        this.tipo_trabajo = tipo_trabajo;
        this.codigo_cliente = codigo_cliente;
        this.encuesta_id = encuesta_id;
        this.encuesta_texto = encuesta_texto;
        this.encuesta_tipovaloracion = encuesta_tipovaloracion;
        this.encuesta_requiereobs = encuesta_requiereobs;
        this.encuesta_opciones = encuesta_opciones;
        this.encuesta_calendario = encuesta_calendario;
        this.encuesta_quizresult = encuesta_quizresult;
        this.horas_restantes = horas_restantes;
        this.complemento_direccion = complemento_direccion;
        this.nombre_rotulo = nombre_rotulo;
        this.email = email;
        this.horario_contacto = horario_contacto;
        this.telefonos = telefonos;
        this.contacto_telefonico = contacto_telefonico;
        this.tel_sat_entidad = tel_sat_entidad;
        this.tel_sat_compañia = tel_sat_compañia;
        this.saveriadetectadaID = saveriadetectadaID;
        this.estado_img = estado_img;
        this.fh_cita = fh_cita;
        this.actividad = actividad;
        this.des_sector_avitidad = des_sector_avitidad;
        this.cli_potential_vida = cli_potential_vida;
        this.contenido_vida = contenido_vida;
        this.idmaterial_c = idmaterial_c;
        this.idmaterial_i = idmaterial_i;
        this.idcompania = idcompania;
        this.fotos_casuistica = fotos_casuistica;
        this.equipos_comercio = equipos_comercio;
        this.casuistica_materiales = casuistica_materiales;
        this.casuistica_acciones = casuistica_acciones;
        this.id_casuistica_materiales_final = id_casuistica_materiales_final;
        this.id_casuistica_acciones_final = id_casuistica_acciones_final;
        this.idtrabajo = idtrabajo;
        this.generico_instalar = generico_instalar;
        this.informacion_adicional = informacion_adicional;
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.mat_propio = mat_propio;
        this.cliente_compania = cliente_compania;
        this.cod_producto_tpv_c = cod_producto_tpv_c;
        this.fungibles_permitidos = fungibles_permitidos;
        this.autoconsumo_consumibles = autoconsumo_consumibles;
        this.serrorcallcenter = serrorcallcenter;
    }

    @NonNull
    public String getIdparte() {
        return idparte;
    }

    public void setIdparte(@NonNull String idparte) {
        this.idparte = idparte;
    }

    public String getScliente() {
        return scliente;
    }

    public void setScliente(String scliente) {
        this.scliente = scliente;
    }

    public String getStrabajo() {
        return strabajo;
    }

    public void setStrabajo(String strabajo) {
        this.strabajo = strabajo;
    }

    public String getSlocalidad() {
        return slocalidad;
    }

    public void setSlocalidad(String slocalidad) {
        this.slocalidad = slocalidad;
    }

    public String getSdireccion() {
        return sdireccion;
    }

    public void setSdireccion(String sdireccion) {
        this.sdireccion = sdireccion;
    }

    public String getDtiempolimite() {
        return dtiempolimite;
    }

    public void setDtiempolimite(String dtiempolimite) {
        this.dtiempolimite = dtiempolimite;
    }

    public String getSnumaveria() {
        return snumaveria;
    }

    public void setSnumaveria(String snumaveria) {
        this.snumaveria = snumaveria;
    }

    public String getDentrada() {
        return dentrada;
    }

    public void setDentrada(String dentrada) {
        this.dentrada = dentrada;
    }

    public String getScomercio() {
        return scomercio;
    }

    public void setScomercio(String scomercio) {
        this.scomercio = scomercio;
    }

    public String getSdenominacion() {
        return sdenominacion;
    }

    public void setSdenominacion(String sdenominacion) {
        this.sdenominacion = sdenominacion;
    }

    public String getScp() {
        return scp;
    }

    public void setScp(String scp) {
        this.scp = scp;
    }

    public String getStel1() {
        return stel1;
    }

    public void setStel1(String stel1) {
        this.stel1 = stel1;
    }

    public String getStel2() {
        return stel2;
    }

    public void setStel2(String stel2) {
        this.stel2 = stel2;
    }

    public String getShorario() {
        return shorario;
    }

    public void setShorario(String shorario) {
        this.shorario = shorario;
    }

    public String getScontacto() {
        return scontacto;
    }

    public void setScontacto(String scontacto) {
        this.scontacto = scontacto;
    }

    public String getSerrorcliente() {
        return serrorcliente;
    }

    public void setSerrorcliente(String serrorcliente) {
        this.serrorcliente = serrorcliente;
    }

    public String getSincidencia() {
        return sincidencia;
    }

    public void setSincidencia(String sincidencia) {
        this.sincidencia = sincidencia;
    }

    public String getSmodelodis() {
        return smodelodis;
    }

    public void setSmodelodis(String smodelodis) {
        this.smodelodis = smodelodis;
    }

    public String getSnumseriedis() {
        return snumseriedis;
    }

    public void setSnumseriedis(String snumseriedis) {
        this.snumseriedis = snumseriedis;
    }

    public String getSaveriadetectada() {
        return saveriadetectada;
    }

    public void setSaveriadetectada(String saveriadetectada) {
        this.saveriadetectada = saveriadetectada;
    }

    public String getSfax() {
        return sfax;
    }

    public void setSfax(String sfax) {
        this.sfax = sfax;
    }

    public String getSmail() {
        return smail;
    }

    public void setSmail(String smail) {
        this.smail = smail;
    }

    public int getIestado() {
        return iestado;
    }

    public void setIestado(int iestado) {
        this.iestado = iestado;
    }

    public String getSfirmat() {
        return sfirmat;
    }

    public void setSfirmat(String sfirmat) {
        this.sfirmat = sfirmat;
    }

    public String getSfirma() {
        return sfirma;
    }

    public void setSfirma(String sfirma) {
        this.sfirma = sfirma;
    }

    public int getIwf() {
        return iwf;
    }

    public void setIwf(int iwf) {
        this.iwf = iwf;
    }

    public int getIhf() {
        return ihf;
    }

    public void setIhf(int ihf) {
        this.ihf = ihf;
    }

    public int getIwft() {
        return iwft;
    }

    public void setIwft(int iwft) {
        this.iwft = iwft;
    }

    public int getIhft() {
        return ihft;
    }

    public void setIhft(int ihft) {
        this.ihft = ihft;
    }

    public String getSpass() {
        return spass;
    }

    public void setSpass(String spass) {
        this.spass = spass;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public String getP3() {
        return p3;
    }

    public void setP3(String p3) {
        this.p3 = p3;
    }

    public String getP4() {
        return p4;
    }

    public void setP4(String p4) {
        this.p4 = p4;
    }

    public String getP5() {
        return p5;
    }

    public void setP5(String p5) {
        this.p5 = p5;
    }

    public String getP6() {
        return p6;
    }

    public void setP6(String p6) {
        this.p6 = p6;
    }

    public String getP7() {
        return p7;
    }

    public void setP7(String p7) {
        this.p7 = p7;
    }

    public String getP8() {
        return p8;
    }

    public void setP8(String p8) {
        this.p8 = p8;
    }

    public String getP9() {
        return p9;
    }

    public void setP9(String p9) {
        this.p9 = p9;
    }

    public String getP10() {
        return p10;
    }

    public void setP10(String p10) {
        this.p10 = p10;
    }

    public String getP11() {
        return p11;
    }

    public void setP11(String p11) {
        this.p11 = p11;
    }

    public String getP12() {
        return p12;
    }

    public void setP12(String p12) {
        this.p12 = p12;
    }

    public String getP13() {
        return p13;
    }

    public void setP13(String p13) {
        this.p13 = p13;
    }

    public String getP14() {
        return p14;
    }

    public void setP14(String p14) {
        this.p14 = p14;
    }

    public String getP15() {
        return p15;
    }

    public void setP15(String p15) {
        this.p15 = p15;
    }

    public String getDfechainicio() {
        return dfechainicio;
    }

    public void setDfechainicio(String dfechainicio) {
        this.dfechainicio = dfechainicio;
    }

    public String getDfechafin() {
        return dfechafin;
    }

    public void setDfechafin(String dfechafin) {
        this.dfechafin = dfechafin;
    }

    public int getItipores() {
        return itipores;
    }

    public void setItipores(int itipores) {
        this.itipores = itipores;
    }

    public String getSobservaciones() {
        return sobservaciones;
    }

    public void setSobservaciones(String sobservaciones) {
        this.sobservaciones = sobservaciones;
    }

    public String getSincidenciares() {
        return sincidenciares;
    }

    public void setSincidenciares(String sincidenciares) {
        this.sincidenciares = sincidenciares;
    }

    public String getSerrorcons() {
        return serrorcons;
    }

    public void setSerrorcons(String serrorcons) {
        this.serrorcons = serrorcons;
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    public int getR3() {
        return r3;
    }

    public void setR3(int r3) {
        this.r3 = r3;
    }

    public int getR4() {
        return r4;
    }

    public void setR4(int r4) {
        this.r4 = r4;
    }

    public int getR5() {
        return r5;
    }

    public void setR5(int r5) {
        this.r5 = r5;
    }

    public int getR6() {
        return r6;
    }

    public void setR6(int r6) {
        this.r6 = r6;
    }

    public int getR7() {
        return r7;
    }

    public void setR7(int r7) {
        this.r7 = r7;
    }

    public int getR8() {
        return r8;
    }

    public void setR8(int r8) {
        this.r8 = r8;
    }

    public int getR9() {
        return r9;
    }

    public void setR9(int r9) {
        this.r9 = r9;
    }

    public int getR10() {
        return r10;
    }

    public void setR10(int r10) {
        this.r10 = r10;
    }

    public int getR11() {
        return r11;
    }

    public void setR11(int r11) {
        this.r11 = r11;
    }

    public int getR12() {
        return r12;
    }

    public void setR12(int r12) {
        this.r12 = r12;
    }

    public int getR13() {
        return r13;
    }

    public void setR13(int r13) {
        this.r13 = r13;
    }

    public int getR14() {
        return r14;
    }

    public void setR14(int r14) {
        this.r14 = r14;
    }

    public int getR15() {
        return r15;
    }

    public void setR15(int r15) {
        this.r15 = r15;
    }

    public String getScliente_r() {
        return scliente_r;
    }

    public void setScliente_r(String scliente_r) {
        this.scliente_r = scliente_r;
    }

    public String getStrabajo_r() {
        return strabajo_r;
    }

    public void setStrabajo_r(String strabajo_r) {
        this.strabajo_r = strabajo_r;
    }

    public String getSlimite_r() {
        return slimite_r;
    }

    public void setSlimite_r(String slimite_r) {
        this.slimite_r = slimite_r;
    }

    public String getScoderrorcliente() {
        return scoderrorcliente;
    }

    public void setScoderrorcliente(String scoderrorcliente) {
        this.scoderrorcliente = scoderrorcliente;
    }

    public String getScodtpvdis() {
        return scodtpvdis;
    }

    public void setScodtpvdis(String scodtpvdis) {
        this.scodtpvdis = scodtpvdis;
    }

    public String getSmodelotpv_i() {
        return smodelotpv_i;
    }

    public void setSmodelotpv_i(String smodelotpv_i) {
        this.smodelotpv_i = smodelotpv_i;
    }

    public String getSnumserietpv_i() {
        return snumserietpv_i;
    }

    public void setSnumserietpv_i(String snumserietpv_i) {
        this.snumserietpv_i = snumserietpv_i;
    }

    public String getScodtpv_i() {
        return scodtpv_i;
    }

    public void setScodtpv_i(String scodtpv_i) {
        this.scodtpv_i = scodtpv_i;
    }

    public String getSpasstpv_i() {
        return spasstpv_i;
    }

    public void setSpasstpv_i(String spasstpv_i) {
        this.spasstpv_i = spasstpv_i;
    }

    public String getSprovincia() {
        return sprovincia;
    }

    public void setSprovincia(String sprovincia) {
        this.sprovincia = sprovincia;
    }

    public String getScia() {
        return scia;
    }

    public void setScia(String scia) {
        this.scia = scia;
    }

    public String getSlocalidad_r() {
        return slocalidad_r;
    }

    public void setSlocalidad_r(String slocalidad_r) {
        this.slocalidad_r = slocalidad_r;
    }

    public String getSsim() {
        return ssim;
    }

    public void setSsim(String ssim) {
        this.ssim = ssim;
    }

    public int getScobm() {
        return scobm;
    }

    public void setScobm(int scobm) {
        this.scobm = scobm;
    }

    public int getScobv() {
        return scobv;
    }

    public void setScobv(int scobv) {
        this.scobv = scobv;
    }

    public int getScobo() {
        return scobo;
    }

    public void setScobo(int scobo) {
        this.scobo = scobo;
    }

    public String getOpenlat() {
        return openlat;
    }

    public void setOpenlat(String openlat) {
        this.openlat = openlat;
    }

    public String getOpenlong() {
        return openlong;
    }

    public void setOpenlong(String openlong) {
        this.openlong = openlong;
    }

    public String getOpendate() {
        return opendate;
    }

    public void setOpendate(String opendate) {
        this.opendate = opendate;
    }

    public String getFinlat() {
        return finlat;
    }

    public void setFinlat(String finlat) {
        this.finlat = finlat;
    }

    public String getFinlong() {
        return finlong;
    }

    public void setFinlong(String finlong) {
        this.finlong = finlong;
    }

    public String getDatefin() {
        return datefin;
    }

    public void setDatefin(String datefin) {
        this.datefin = datefin;
    }

    public String getSfirmadopor() {
        return sfirmadopor;
    }

    public void setSfirmadopor(String sfirmadopor) {
        this.sfirmadopor = sfirmadopor;
    }

    public String getDlimiteorden() {
        return dlimiteorden;
    }

    public void setDlimiteorden(String dlimiteorden) {
        this.dlimiteorden = dlimiteorden;
    }

    public int getOrden_tecnico() {
        return orden_tecnico;
    }

    public void setOrden_tecnico(int orden_tecnico) {
        this.orden_tecnico = orden_tecnico;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getStellong() {
        return stellong;
    }

    public void setStellong(String stellong) {
        this.stellong = stellong;
    }

    public String getTipo_trabajo() {
        return tipo_trabajo;
    }

    public void setTipo_trabajo(String tipo_trabajo) {
        this.tipo_trabajo = tipo_trabajo;
    }

    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getEncuesta_id() {
        return encuesta_id;
    }

    public void setEncuesta_id(String encuesta_id) {
        this.encuesta_id = encuesta_id;
    }

    public String getEncuesta_texto() {
        return encuesta_texto;
    }

    public void setEncuesta_texto(String encuesta_texto) {
        this.encuesta_texto = encuesta_texto;
    }

    public String getEncuesta_tipovaloracion() {
        return encuesta_tipovaloracion;
    }

    public void setEncuesta_tipovaloracion(String encuesta_tipovaloracion) {
        this.encuesta_tipovaloracion = encuesta_tipovaloracion;
    }

    public String getEncuesta_requiereobs() {
        return encuesta_requiereobs;
    }

    public void setEncuesta_requiereobs(String encuesta_requiereobs) {
        this.encuesta_requiereobs = encuesta_requiereobs;
    }

    public String getEncuesta_opciones() {
        return encuesta_opciones;
    }

    public void setEncuesta_opciones(String encuesta_opciones) {
        this.encuesta_opciones = encuesta_opciones;
    }

    public String getEncuesta_calendario() {
        return encuesta_calendario;
    }

    public void setEncuesta_calendario(String encuesta_calendario) {
        this.encuesta_calendario = encuesta_calendario;
    }

    public String getEncuesta_quizresult() {
        return encuesta_quizresult;
    }

    public void setEncuesta_quizresult(String encuesta_quizresult) {
        this.encuesta_quizresult = encuesta_quizresult;
    }

    public String getHoras_restantes() {
        return horas_restantes;
    }

    public void setHoras_restantes(String horas_restantes) {
        this.horas_restantes = horas_restantes;
    }

    public String getComplemento_direccion() {
        return complemento_direccion;
    }

    public void setComplemento_direccion(String complemento_direccion) {
        this.complemento_direccion = complemento_direccion;
    }

    public String getNombre_rotulo() {
        return nombre_rotulo;
    }

    public void setNombre_rotulo(String nombre_rotulo) {
        this.nombre_rotulo = nombre_rotulo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHorario_contacto() {
        return horario_contacto;
    }

    public void setHorario_contacto(String horario_contacto) {
        this.horario_contacto = horario_contacto;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getContacto_telefonico() {
        return contacto_telefonico;
    }

    public void setContacto_telefonico(String contacto_telefonico) {
        this.contacto_telefonico = contacto_telefonico;
    }

    public String getTel_sat_entidad() {
        return tel_sat_entidad;
    }

    public void setTel_sat_entidad(String tel_sat_entidad) {
        this.tel_sat_entidad = tel_sat_entidad;
    }

    public String getTel_sat_compañia() {
        return tel_sat_compañia;
    }

    public void setTel_sat_compañia(String tel_sat_compañia) {
        this.tel_sat_compañia = tel_sat_compañia;
    }

    public String getSaveriadetectadaID() {
        return saveriadetectadaID;
    }

    public void setSaveriadetectadaID(String saveriadetectadaID) {
        this.saveriadetectadaID = saveriadetectadaID;
    }

    public String getEstado_img() {
        return estado_img;
    }

    public void setEstado_img(String estado_img) {
        this.estado_img = estado_img;
    }

    public String getFh_cita() {
        return fh_cita;
    }

    public void setFh_cita(String fh_cita) {
        this.fh_cita = fh_cita;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getDes_sector_avitidad() {
        return des_sector_avitidad;
    }

    public void setDes_sector_avitidad(String des_sector_avitidad) {
        this.des_sector_avitidad = des_sector_avitidad;
    }

    public int getCli_potential_vida() {
        return cli_potential_vida;
    }

    public void setCli_potential_vida(int cli_potential_vida) {
        this.cli_potential_vida = cli_potential_vida;
    }

    public String getContenido_vida() {
        return contenido_vida;
    }

    public void setContenido_vida(String contenido_vida) {
        this.contenido_vida = contenido_vida;
    }

    public String getIdmaterial_c() {
        return idmaterial_c;
    }

    public void setIdmaterial_c(String idmaterial_c) {
        this.idmaterial_c = idmaterial_c;
    }

    public String getIdmaterial_i() {
        return idmaterial_i;
    }

    public void setIdmaterial_i(String idmaterial_i) {
        this.idmaterial_i = idmaterial_i;
    }

    public int getIdcompania() {
        return idcompania;
    }

    public void setIdcompania(int idcompania) {
        this.idcompania = idcompania;
    }

    public String getFotos_casuistica() {
        return fotos_casuistica;
    }

    public void setFotos_casuistica(String fotos_casuistica) {
        this.fotos_casuistica = fotos_casuistica;
    }

    public String getEquipos_comercio() {
        return equipos_comercio;
    }

    public void setEquipos_comercio(String equipos_comercio) {
        this.equipos_comercio = equipos_comercio;
    }

    public String getCasuistica_materiales() {
        return casuistica_materiales;
    }

    public void setCasuistica_materiales(String casuistica_materiales) {
        this.casuistica_materiales = casuistica_materiales;
    }

    public String getCasuistica_acciones() {
        return casuistica_acciones;
    }

    public void setCasuistica_acciones(String casuistica_acciones) {
        this.casuistica_acciones = casuistica_acciones;
    }

    public int getId_casuistica_materiales_final() {
        return id_casuistica_materiales_final;
    }

    public void setId_casuistica_materiales_final(int id_casuistica_materiales_final) {
        this.id_casuistica_materiales_final = id_casuistica_materiales_final;
    }

    public int getId_casuistica_acciones_final() {
        return id_casuistica_acciones_final;
    }

    public void setId_casuistica_acciones_final(int id_casuistica_acciones_final) {
        this.id_casuistica_acciones_final = id_casuistica_acciones_final;
    }

    public int getIdtrabajo() {
        return idtrabajo;
    }

    public void setIdtrabajo(int idtrabajo) {
        this.idtrabajo = idtrabajo;
    }

    public int getGenerico_instalar() {
        return generico_instalar;
    }

    public void setGenerico_instalar(int generico_instalar) {
        this.generico_instalar = generico_instalar;
    }

    public String getInformacion_adicional() {
        return informacion_adicional;
    }

    public void setInformacion_adicional(String informacion_adicional) {
        this.informacion_adicional = informacion_adicional;
    }

    public int getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(int tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public int getMat_propio() {
        return mat_propio;
    }

    public void setMat_propio(int mat_propio) {
        this.mat_propio = mat_propio;
    }

    public int getCliente_compania() {
        return cliente_compania;
    }

    public void setCliente_compania(int cliente_compania) {
        this.cliente_compania = cliente_compania;
    }

    public String getCod_producto_tpv_c() {
        return cod_producto_tpv_c;
    }

    public void setCod_producto_tpv_c(String cod_producto_tpv_c) {
        this.cod_producto_tpv_c = cod_producto_tpv_c;
    }

    public String getFungibles_permitidos() {
        return fungibles_permitidos;
    }

    public void setFungibles_permitidos(String fungibles_permitidos) {
        this.fungibles_permitidos = fungibles_permitidos;
    }

    public int getAutoconsumo_consumibles() {
        return autoconsumo_consumibles;
    }

    public void setAutoconsumo_consumibles(int autoconsumo_consumibles) {
        this.autoconsumo_consumibles = autoconsumo_consumibles;
    }

    public String getSerrorcallcenter() {
        return serrorcallcenter;
    }

    public void setSerrorcallcenter(String serrorcallcenter) {
        this.serrorcallcenter = serrorcallcenter;
    }
}
