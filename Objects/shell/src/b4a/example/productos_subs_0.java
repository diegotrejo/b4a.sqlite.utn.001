package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class productos_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private sql As SQL";
productos._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");__ref.setField("_sql",productos._sql);
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _id,RemoteObject _nombreproducto,RemoteObject _preciounitario,RemoteObject _iva,RemoteObject _stock) throws Exception{
try {
		Debug.PushSubsStack("Create (productos) ","productos",3,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "productos","create", __ref, _id, _nombreproducto, _preciounitario, _iva, _stock);}
RemoteObject _p = RemoteObject.declareNull("b4a.example.producto");
Debug.locals.put("id", _id);
Debug.locals.put("nombreProducto", _nombreproducto);
Debug.locals.put("precioUnitario", _preciounitario);
Debug.locals.put("iva", _iva);
Debug.locals.put("stock", _stock);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Create( id As Int, nombreProducto As St";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="sql.ExecNonQuery2(\"INSERT INTO productos( id, nom";
Debug.ShouldStop(4096);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO productos( id, nombreProducto, precioUnitario, iva, stock ) VALUES ( ?, ?, ?, ?, ? )")),(Object)(productos.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_id),(_nombreproducto),(_preciounitario),(_iva),(_stock)})))));
 BA.debugLineNum = 15;BA.debugLine="Dim p As Producto";
Debug.ShouldStop(16384);
_p = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("p", _p);
 BA.debugLineNum = 16;BA.debugLine="p.Initialize";
Debug.ShouldStop(32768);
_p.runClassMethod (b4a.example.producto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 18;BA.debugLine="p.Id = id";
Debug.ShouldStop(131072);
_p.setField ("_id" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 19;BA.debugLine="p.NombreProducto = nombreProducto";
Debug.ShouldStop(262144);
_p.setField ("_nombreproducto" /*RemoteObject*/ ,_nombreproducto);
 BA.debugLineNum = 20;BA.debugLine="p.PrecioUnitario = precioUnitario";
Debug.ShouldStop(524288);
_p.setField ("_preciounitario" /*RemoteObject*/ ,_preciounitario);
 BA.debugLineNum = 21;BA.debugLine="p.IVA = iva";
Debug.ShouldStop(1048576);
_p.setField ("_iva" /*RemoteObject*/ ,_iva);
 BA.debugLineNum = 22;BA.debugLine="p.Stock = stock";
Debug.ShouldStop(2097152);
_p.setField ("_stock" /*RemoteObject*/ ,_stock);
 BA.debugLineNum = 24;BA.debugLine="Return p";
Debug.ShouldStop(8388608);
if (true) return _p;
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Delete (productos) ","productos",3,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "productos","delete", __ref, _id);}
Debug.locals.put("id", _id);
 BA.debugLineNum = 74;BA.debugLine="Public Sub Delete(id As Int) As Boolean";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="sql.ExecNonQuery(\"DELETE FROM productos WHERE id";
Debug.ShouldStop(1024);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM productos WHERE id = "),_id)));
 BA.debugLineNum = 76;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return productos.__c.getField(true,"True");
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _nombrebdd) throws Exception{
try {
		Debug.PushSubsStack("Initialize (productos) ","productos",3,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "productos","initialize", __ref, _ba, _nombrebdd);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("nombreBdd", _nombrebdd);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize( nombreBdd As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 7;BA.debugLine="sql.Initialize( File.DirInternal, nombreBdd, True";
Debug.ShouldStop(64);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(productos.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_nombrebdd),(Object)(productos.__c.getField(true,"True")));
 BA.debugLineNum = 9;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS prod";
Debug.ShouldStop(256);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS productos( id INT PRIMARY KEY, nombreProducto TEXT(50), precioUnitario NUMBER(10,3), iva NUMBER(5,3), stock NUMBER(10,3) )")));
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_all(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Read_All (productos) ","productos",3,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("read_all")) { return __ref.runUserSub(false, "productos","read_all", __ref);}
RemoteObject _resultado = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("b4a.example.producto");
 BA.debugLineNum = 27;BA.debugLine="Public Sub Read_All () As List";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Dim resultado As List";
Debug.ShouldStop(134217728);
_resultado = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("resultado", _resultado);
 BA.debugLineNum = 29;BA.debugLine="resultado.Initialize";
Debug.ShouldStop(268435456);
_resultado.runVoidMethod ("Initialize");
 BA.debugLineNum = 31;BA.debugLine="Dim cursor As Cursor";
Debug.ShouldStop(1073741824);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 32;BA.debugLine="cursor = sql.ExecQuery(\"SELECT id, nombreProduct";
Debug.ShouldStop(-2147483648);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), __ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT id, nombreProducto, precioUnitario, iva, stock FROM productos ORDER BY nombreProducto"))));Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 33;BA.debugLine="For i=0 To cursor.RowCount-1";
Debug.ShouldStop(1);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 34;BA.debugLine="cursor.Position = i";
Debug.ShouldStop(2);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 36;BA.debugLine="Dim p As Producto";
Debug.ShouldStop(8);
_p = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("p", _p);
 BA.debugLineNum = 37;BA.debugLine="p.Initialize";
Debug.ShouldStop(16);
_p.runClassMethod (b4a.example.producto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 38;BA.debugLine="p.Id = cursor.GetInt(\"id\")";
Debug.ShouldStop(32);
_p.setField ("_id" /*RemoteObject*/ ,_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id"))));
 BA.debugLineNum = 39;BA.debugLine="p.NombreProducto = cursor.GetString(\"nombreProdu";
Debug.ShouldStop(64);
_p.setField ("_nombreproducto" /*RemoteObject*/ ,_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nombreProducto"))));
 BA.debugLineNum = 40;BA.debugLine="p.PrecioUnitario = cursor.GetDouble(\"precioUnita";
Debug.ShouldStop(128);
_p.setField ("_preciounitario" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("precioUnitario"))));
 BA.debugLineNum = 41;BA.debugLine="p.IVA = cursor.GetDouble(\"iva\")";
Debug.ShouldStop(256);
_p.setField ("_iva" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("iva"))));
 BA.debugLineNum = 42;BA.debugLine="p.Stock = cursor.GetDouble(\"stock\")";
Debug.ShouldStop(512);
_p.setField ("_stock" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("stock"))));
 BA.debugLineNum = 44;BA.debugLine="resultado.Add(p)";
Debug.ShouldStop(2048);
_resultado.runVoidMethod ("Add",(Object)((_p)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 47;BA.debugLine="Return resultado";
Debug.ShouldStop(16384);
if (true) return _resultado;
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_byid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (productos) ","productos",3,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("read_byid")) { return __ref.runUserSub(false, "productos","read_byid", __ref, _id);}
RemoteObject _p = RemoteObject.declareNull("b4a.example.producto");
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("id", _id);
 BA.debugLineNum = 50;BA.debugLine="Public Sub Read_ById( id As Int) As Producto";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="Dim p As Producto";
Debug.ShouldStop(262144);
_p = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("p", _p);
 BA.debugLineNum = 53;BA.debugLine="Dim cursor As Cursor";
Debug.ShouldStop(1048576);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 54;BA.debugLine="cursor = sql.ExecQuery(\"SELECT id, nombreProducto";
Debug.ShouldStop(2097152);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), __ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT id, nombreProducto, precioUnitario, iva, stock FROM productos WHERE id = "),_id))));Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 55;BA.debugLine="If cursor.RowCount > 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_cursor.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 56;BA.debugLine="cursor.Position = 0";
Debug.ShouldStop(8388608);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 58;BA.debugLine="p.Initialize";
Debug.ShouldStop(33554432);
_p.runClassMethod (b4a.example.producto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 59;BA.debugLine="p.Id = cursor.GetInt(\"id\")";
Debug.ShouldStop(67108864);
_p.setField ("_id" /*RemoteObject*/ ,_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id"))));
 BA.debugLineNum = 60;BA.debugLine="p.NombreProducto = cursor.GetString(\"nombreProdu";
Debug.ShouldStop(134217728);
_p.setField ("_nombreproducto" /*RemoteObject*/ ,_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nombreProducto"))));
 BA.debugLineNum = 61;BA.debugLine="p.PrecioUnitario = cursor.GetDouble(\"precioUnita";
Debug.ShouldStop(268435456);
_p.setField ("_preciounitario" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("precioUnitario"))));
 BA.debugLineNum = 62;BA.debugLine="p.IVA = cursor.GetDouble(\"iva\")";
Debug.ShouldStop(536870912);
_p.setField ("_iva" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("iva"))));
 BA.debugLineNum = 63;BA.debugLine="p.Stock = cursor.GetDouble(\"stock\")";
Debug.ShouldStop(1073741824);
_p.setField ("_stock" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("stock"))));
 };
 BA.debugLineNum = 66;BA.debugLine="Return p";
Debug.ShouldStop(2);
if (true) return _p;
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _nombreproducto,RemoteObject _preciounitario,RemoteObject _iva,RemoteObject _stock) throws Exception{
try {
		Debug.PushSubsStack("Update (productos) ","productos",3,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "productos","update", __ref, _id, _nombreproducto, _preciounitario, _iva, _stock);}
Debug.locals.put("id", _id);
Debug.locals.put("nombreProducto", _nombreproducto);
Debug.locals.put("precioUnitario", _preciounitario);
Debug.locals.put("iva", _iva);
Debug.locals.put("stock", _stock);
 BA.debugLineNum = 69;BA.debugLine="Public Sub Update(id As Int, nombreProducto As Str";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="sql.ExecNonQuery2(\"UPDATE productos SET nombrePro";
Debug.ShouldStop(32);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("UPDATE productos SET nombreProducto = ?, precioUnitario = ?, iva = ?, stock = ? WHERE id = ?")),(Object)(productos.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_nombreproducto),(_preciounitario),(_iva),(_stock),(_id)})))));
 BA.debugLineNum = 71;BA.debugLine="Return True";
Debug.ShouldStop(64);
if (true) return productos.__c.getField(true,"True");
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}