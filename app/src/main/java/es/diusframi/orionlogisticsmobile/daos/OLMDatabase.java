package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import es.diusframi.orionlogisticsmobile.models.CasuisticaAcciones;
import es.diusframi.orionlogisticsmobile.models.CasuisticaAccionesDB;
import es.diusframi.orionlogisticsmobile.models.DiusAlarmasDB;
import es.diusframi.orionlogisticsmobile.models.DiusAlbaranesDB;
import es.diusframi.orionlogisticsmobile.models.DiusBusinessunitsDB;
import es.diusframi.orionlogisticsmobile.models.DiusCasuisticaAccionesDB;
import es.diusframi.orionlogisticsmobile.models.DiusCasuisticaMaterialesDB;
import es.diusframi.orionlogisticsmobile.models.DiusClosingrulesDB;
import es.diusframi.orionlogisticsmobile.models.DiusCommunicationsDB;
import es.diusframi.orionlogisticsmobile.models.DiusComplementosDB;
import es.diusframi.orionlogisticsmobile.models.DiusDatosincidenciaparteDB;
import es.diusframi.orionlogisticsmobile.models.DiusDatosllamadaparteDB;
import es.diusframi.orionlogisticsmobile.models.DiusErroresDB;
import es.diusframi.orionlogisticsmobile.models.DiusFotosparteDB;
import es.diusframi.orionlogisticsmobile.models.DiusGastosDB;
import es.diusframi.orionlogisticsmobile.models.DiusLastupdatesDB;
import es.diusframi.orionlogisticsmobile.models.DiusMaterialesDB;
import es.diusframi.orionlogisticsmobile.models.DiusMaterialesV2DB;
import es.diusframi.orionlogisticsmobile.models.DiusMensajesDB;
import es.diusframi.orionlogisticsmobile.models.DiusModelsDB;
import es.diusframi.orionlogisticsmobile.models.DiusNotificacionesDB;
import es.diusframi.orionlogisticsmobile.models.DiusObservationDB;
import es.diusframi.orionlogisticsmobile.models.DiusPartesDB;
import es.diusframi.orionlogisticsmobile.models.DiusPendientesDB;
import es.diusframi.orionlogisticsmobile.models.DiusResolucionesDB;
import es.diusframi.orionlogisticsmobile.models.SincidenciaDesCodigoErrorDB;
import es.diusframi.orionlogisticsmobile.models.TmpAlbaranesagrupadosDB;
import es.diusframi.orionlogisticsmobile.models.User;

/**
 * Created by RicardoAveledo on 08/10/2020.
 */
@Database(entities = {User.class, CasuisticaAccionesDB.class, DiusAlarmasDB.class, DiusBusinessunitsDB.class, DiusAlbaranesDB.class,
        DiusCasuisticaAccionesDB.class, DiusCasuisticaMaterialesDB.class, DiusClosingrulesDB.class, DiusCommunicationsDB.class, DiusComplementosDB.class,
        DiusDatosincidenciaparteDB.class, DiusDatosllamadaparteDB.class, DiusErroresDB.class, DiusFotosparteDB.class, DiusGastosDB.class,
        DiusLastupdatesDB.class, DiusMaterialesDB.class, DiusMaterialesV2DB.class,
        DiusMensajesDB.class, DiusModelsDB.class, DiusNotificacionesDB.class, DiusObservationDB.class, DiusPartesDB.class,
        DiusPendientesDB.class, DiusResolucionesDB.class, SincidenciaDesCodigoErrorDB.class, TmpAlbaranesagrupadosDB.class}, version = 1)

public abstract class OLMDatabase extends RoomDatabase {
    public abstract UserDao getUserDao();
    public abstract CasuisticaAccionesDao getCasuisticaAccionesDao();
    public abstract DiusAlarmasDao getDiusAlarmasDao();
    public abstract DiusBusinessunitsDao getDiusBusinessunitsDao();
    public abstract DiusAlbaranesDao getDiusAlbaranesDao();
    public abstract DiusCasuisticaAccionesDao getDiusCasuisticaAccionesDao();
    public abstract DiusCasuisticaMaterialesDao getDiusCasuisticaMaterialesDao();
    public abstract DiusClosingrulesDao getDiusClosingrulesDao();
    public abstract DiusCommunicationsDao getDiusCommunicationsDao();
    public abstract DiusComplementosDao getDiusComplementosDao();
    public abstract DiusDatosincidenciaparteDao getDiusDatosincidenciaparteDao();
    public abstract DiusDatosllamadaparteDao getDiusDatosllamadaparteDao();
    public abstract DiusErroresDao getDiusErroresDao();
    public abstract DiusFotosparteDao getDiusFotosparteDao();
    public abstract DiusGastosDao getDiusGastosDao();
    public abstract DiusLastupdatesDao getDiusLastupdatesDao();
    public abstract DiusMaterialesDao getDiusMaterialesDao();
    public abstract DiusMaterialesV2Dao getDiusMaterialesV2Dao();
    public abstract DiusMensajesDao getDiusMensajesDao();
    public abstract DiusModelsDao getDiusModelsDao();
    public abstract DiusNotificacionesDao getDiusNotificacionesDao();
    public abstract DiusObservationDao getDiusObservationDao();
    public abstract DiusPartesDao getDiusPartesDao();
    public abstract DiusPendientesDao getDiusPendientesDao();
    public abstract DiusResolucionesDao getDiusResolucionesDao();
    public abstract SincidenciaDesCodigoErrorDao getSincidenciaDesCodigoErrorDao();
    public abstract TmpAlbaranesagrupadosDao getTmpAlbaranesagrupadosDao();



}