/* 1. No sirve
SELECT c.Fecha AS 'Fecha Compra',c.Proveedor AS 'Nom. Proveedor', c.ID_Compra , c.Pagado  AS 'Codigo Compra'
FROM Compra c 
WHERE c.ID_Compra BETWEEN 1 AND 15
ORDER BY c.ID_Compra DESC;
*/
/* 1. Si sirve
SELECT c.Fecha AS 'Fecha Compra',c.Proveedor AS 'Nom. Proveedor', c.ID_Compra AS 'Codigo Compra' , c.Pagado
FROM Compra c ORDER BY c.ID_Compra DESC LIMIT 15;/*

/* 2. Si sirve
SELECT p.Fecha_Inicio AS 'Fec. Ini.', p.Ciudad AS 'Nombre Ciudad', 
p.Constructora AS 'Nom. Constructora', l.Nombre ||' '|| l.Segundo_Apellido AS 'Nombre Lider',
t.Codigo_Tipo AS 'Codigo Tipo',t.Estrato
FROM Proyecto p 
INNER JOIN Lider l ON l.ID_Lider = p.ID_Lider 
INNER JOIN Tipo t ON t.ID_Tipo = p.ID_Tipo 
WHERE p.Fecha_Inicio BETWEEN '2020-01-01' AND '2020-07-09'
AND p.Ciudad = 'Ibague'
;
*/

SELECT p.Fecha_Inicio AS 'Fec. Ini.', p.Ciudad AS 'Nombre Ciudad', 
p.Constructora AS 'Nom. Constructora', l.Nombre ||' '|| l.Segundo_Apellido AS 'Nombre Lider',
t.Codigo_Tipo AS 'Codigo Tipo',t.Estrato
FROM Proyecto p 
INNER JOIN Lider l ON l.ID_Lider = p.ID_Lider 
INNER JOIN Tipo t ON t.ID_Tipo = p.ID_Tipo 
WHERE p.Fecha_Inicio BETWEEN '2020-01-01' AND '2020-07-09'
AND p.Ciudad = 'Ibague'

/* 3. No sirve debe dar 196 no da por que cuando verifica 2 cosas en la misma tabla mc.id_material no deja
SELECT COUNT(*) AS 'Numero Proyectos' FROM Proyecto p
INNER JOIN Compra c ON c.ID_Proyecto = p.ID_Proyecto 
INNER JOIN MaterialConstruccion mc ON mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion 
WHERE p.Fecha_Inicio >= '2020-10-12' 
AND p.ID_Lider != 2 AND p.Acabados = 'Si' AND mc.ID_MaterialConstruccion != 2 AND mc.ID_MaterialConstruccion != 5 ;
*/
/* 3. esta es la correcta ya que esta si permite revisar las dos condiciones en la tabla de compras con id_materialconstruccion
SELECT COUNT(p.ID_Proyecto) AS 'Numero Proyectos' FROM Proyecto p
WHERE ((p.Fecha_Inicio >= "2020-10-12")
AND NOT EXISTS (SELECT 1 FROM Lider l
WHERE (l.ID_Lider = p.ID_Lider) AND (l.ID_Lider = 2))
AND NOT EXISTS (SELECT 1 FROM Compra c
WHERE (c.ID_Proyecto = p.ID_Proyecto) AND (c.ID_MaterialConstruccion = 2)
AND EXISTS (SELECT 1 FROM Compra c
WHERE (c.ID_Proyecto=p.ID_Proyecto) AND c.ID_MaterialConstruccion = 5)));
*/

/* 4. si sirve aca
SELECT SUBSTR(l.Nombre,1,3) || SUBSTR(l.Primer_Apellido ,1,3) || SUBSTR(l.Segundo_Apellido ,1,3)
AS 'Abrev.' FROM Lider l 
*/

/* 5. Si Sirve
SELECT p.Constructora ,SUM(l.Salario) AS 'Salario Lider' FROM Proyecto p 
INNER JOIN Lider l ON l.ID_Lider = p.ID_Lider 
GROUP BY p.Constructora HAVING SUM(l.Salario) > 35000000 AND SUM(l.Salario)<44000000;
*/



