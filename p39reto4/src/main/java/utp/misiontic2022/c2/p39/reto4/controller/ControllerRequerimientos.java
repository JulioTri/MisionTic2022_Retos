package utp.misiontic2022.c2.p39.reto4.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2022.c2.p39.reto4.model.dao.ProyectoDao;
import utp.misiontic2022.c2.p39.reto4.model.dao.RequerimientoDao_1;
import utp.misiontic2022.c2.p39.reto4.model.dao.RequerimientoDao_2;
import utp.misiontic2022.c2.p39.reto4.model.dao.RequerimientoDao_3;
import utp.misiontic2022.c2.p39.reto4.model.vo.Proyecto;
import utp.misiontic2022.c2.p39.reto4.model.vo.Requerimiento_1;
import utp.misiontic2022.c2.p39.reto4.model.vo.Requerimiento_2;
import utp.misiontic2022.c2.p39.reto4.model.vo.Requerimiento_3;

public class ControllerRequerimientos {

    private final RequerimientoDao_1 requerimientoDao_1 = new RequerimientoDao_1();
    private final RequerimientoDao_2 requerimientoDao_2 = new RequerimientoDao_2();
    private final RequerimientoDao_3 requerimientoDao_3 = new RequerimientoDao_3();
    private final ProyectoDao proyectos = new ProyectoDao();

    public ArrayList<Requerimiento_1> consultarRequerimiento1()
            throws SQLException {

        return this.requerimientoDao_1.requerimiento1();
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2()
            throws SQLException {
        return this.requerimientoDao_2.requerimiento2();
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2(String fIni, String fFinal, String Ciudad)
            throws SQLException {
        return this.requerimientoDao_2.requerimiento2(fIni, fFinal, Ciudad);
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3()
            throws SQLException {
        return this.requerimientoDao_3.requerimiento3();
    }

    public ArrayList<Proyecto> consultarProyectos()
            throws SQLException {
        return this.proyectos.proyecto();
    }
}
