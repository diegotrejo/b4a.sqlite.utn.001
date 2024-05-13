package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class productos extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.productos");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.productos.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.sql.SQL _sql = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.productos __ref,anywheresoftware.b4a.BA _ba,String _nombrebdd) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_nombrebdd}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Initialize( nombreBdd As String)";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="sql.Initialize( File.DirInternal, nombreBdd, True";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .Initialize(__c.File.getDirInternal(),_nombrebdd,__c.True);
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS prod";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("CREATE TABLE IF NOT EXISTS productos( id INT PRIMARY KEY, nombreProducto TEXT(50), precioUnitario NUMBER(10,3), iva NUMBER(5,3), stock NUMBER(10,3) )");
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="End Sub";
return "";
}
public boolean  _delete(b4a.example.productos __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((Boolean) Debug.delegate(ba, "delete", new Object[] {_id}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Public Sub Delete(id As Int) As Boolean";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="sql.ExecNonQuery(\"DELETE FROM productos WHERE id";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM productos WHERE id = "+BA.NumberToString(_id));
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="End Sub";
return false;
}
public b4a.example.producto  _create(b4a.example.productos __ref,int _id,String _nombreproducto,double _preciounitario,double _iva,double _stock) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((b4a.example.producto) Debug.delegate(ba, "create", new Object[] {_id,_nombreproducto,_preciounitario,_iva,_stock}));}
b4a.example.producto _p = null;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub Create( id As Int, nombreProducto As St";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="sql.ExecNonQuery2(\"INSERT INTO productos( id, nom";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO productos( id, nombreProducto, precioUnitario, iva, stock ) VALUES ( ?, ?, ?, ?, ? )",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id),(Object)(_nombreproducto),(Object)(_preciounitario),(Object)(_iva),(Object)(_stock)}));
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Dim p As Producto";
_p = new b4a.example.producto();
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="p.Initialize";
_p._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="p.Id = id";
_p._id /*int*/  = _id;
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="p.NombreProducto = nombreProducto";
_p._nombreproducto /*String*/  = _nombreproducto;
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="p.PrecioUnitario = precioUnitario";
_p._preciounitario /*double*/  = _preciounitario;
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="p.IVA = iva";
_p._iva /*double*/  = _iva;
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="p.Stock = stock";
_p._stock /*double*/  = _stock;
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="End Sub";
return null;
}
public b4a.example.producto  _read_byid(b4a.example.productos __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "read_byid", false))
	 {return ((b4a.example.producto) Debug.delegate(ba, "read_byid", new Object[] {_id}));}
b4a.example.producto _p = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub Read_ById( id As Int) As Producto";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim p As Producto";
_p = new b4a.example.producto();
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="cursor = sql.ExecQuery(\"SELECT id, nombreProducto";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT id, nombreProducto, precioUnitario, iva, stock FROM productos WHERE id = "+BA.NumberToString(_id))));
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="If cursor.RowCount > 0 Then";
if (_cursor.getRowCount()>0) { 
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="cursor.Position = 0";
_cursor.setPosition((int) (0));
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="p.Initialize";
_p._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="p.Id = cursor.GetInt(\"id\")";
_p._id /*int*/  = _cursor.GetInt("id");
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="p.NombreProducto = cursor.GetString(\"nombreProdu";
_p._nombreproducto /*String*/  = _cursor.GetString("nombreProducto");
RDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="p.PrecioUnitario = cursor.GetDouble(\"precioUnita";
_p._preciounitario /*double*/  = _cursor.GetDouble("precioUnitario");
RDebugUtils.currentLine=2555916;
 //BA.debugLineNum = 2555916;BA.debugLine="p.IVA = cursor.GetDouble(\"iva\")";
_p._iva /*double*/  = _cursor.GetDouble("iva");
RDebugUtils.currentLine=2555917;
 //BA.debugLineNum = 2555917;BA.debugLine="p.Stock = cursor.GetDouble(\"stock\")";
_p._stock /*double*/  = _cursor.GetDouble("stock");
 };
RDebugUtils.currentLine=2555920;
 //BA.debugLineNum = 2555920;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=2555921;
 //BA.debugLineNum = 2555921;BA.debugLine="End Sub";
return null;
}
public boolean  _update(b4a.example.productos __ref,int _id,String _nombreproducto,double _preciounitario,double _iva,double _stock) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((Boolean) Debug.delegate(ba, "update", new Object[] {_id,_nombreproducto,_preciounitario,_iva,_stock}));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub Update(id As Int, nombreProducto As Str";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="sql.ExecNonQuery2(\"UPDATE productos SET nombrePro";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("UPDATE productos SET nombreProducto = ?, precioUnitario = ?, iva = ?, stock = ? WHERE id = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_nombreproducto),(Object)(_preciounitario),(Object)(_iva),(Object)(_stock),(Object)(_id)}));
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4a.example.productos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Private sql As SQL";
_sql = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _read_all(b4a.example.productos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "read_all", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "read_all", null));}
anywheresoftware.b4a.objects.collections.List _resultado = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
b4a.example.producto _p = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub Read_All () As List";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim resultado As List";
_resultado = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="resultado.Initialize";
_resultado.Initialize();
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="cursor = sql.ExecQuery(\"SELECT id, nombreProduct";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT id, nombreProducto, precioUnitario, iva, stock FROM productos ORDER BY nombreProducto")));
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="For i=0 To cursor.RowCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="Dim p As Producto";
_p = new b4a.example.producto();
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="p.Initialize";
_p._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="p.Id = cursor.GetInt(\"id\")";
_p._id /*int*/  = _cursor.GetInt("id");
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="p.NombreProducto = cursor.GetString(\"nombreProdu";
_p._nombreproducto /*String*/  = _cursor.GetString("nombreProducto");
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="p.PrecioUnitario = cursor.GetDouble(\"precioUnita";
_p._preciounitario /*double*/  = _cursor.GetDouble("precioUnitario");
RDebugUtils.currentLine=1900558;
 //BA.debugLineNum = 1900558;BA.debugLine="p.IVA = cursor.GetDouble(\"iva\")";
_p._iva /*double*/  = _cursor.GetDouble("iva");
RDebugUtils.currentLine=1900559;
 //BA.debugLineNum = 1900559;BA.debugLine="p.Stock = cursor.GetDouble(\"stock\")";
_p._stock /*double*/  = _cursor.GetDouble("stock");
RDebugUtils.currentLine=1900561;
 //BA.debugLineNum = 1900561;BA.debugLine="resultado.Add(p)";
_resultado.Add((Object)(_p));
 }
};
RDebugUtils.currentLine=1900564;
 //BA.debugLineNum = 1900564;BA.debugLine="Return resultado";
if (true) return _resultado;
RDebugUtils.currentLine=1900565;
 //BA.debugLineNum = 1900565;BA.debugLine="End Sub";
return null;
}
}