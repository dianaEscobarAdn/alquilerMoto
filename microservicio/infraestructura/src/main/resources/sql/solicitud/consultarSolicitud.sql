select idSolicitud,idProducto,idPersona,fechaSolicitud,diasAlquiler,fechaDevolucion,valorSolicitud,valorDeposito
from solicitud
where idSolicitud = :idSolicitud