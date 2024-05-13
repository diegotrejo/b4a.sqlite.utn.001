package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="productos.Initialize(\"tienda.data\")";
Debug.ShouldStop(1);
main.mostCurrent._productos.runClassMethod (b4a.example.productos.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(RemoteObject.createImmutable("tienda.data")));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,40);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,36);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmddelete_click() throws Exception{
try {
		Debug.PushSubsStack("cmdDelete_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,44);
if (RapidSub.canDelegate("cmddelete_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","cmddelete_click");}
 BA.debugLineNum = 44;BA.debugLine="Private Sub cmdDelete_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="productos.Delete( txtId.Text )";
Debug.ShouldStop(4096);
main.mostCurrent._productos.runClassMethod (b4a.example.productos.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txtid.runMethod(true,"getText"))));
 BA.debugLineNum = 46;BA.debugLine="txtId.Text = \"\"";
Debug.ShouldStop(8192);
main.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 47;BA.debugLine="txtNombreProducto.Text = \"\"";
Debug.ShouldStop(16384);
main.mostCurrent._txtnombreproducto.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 48;BA.debugLine="txtPrecioUnitario.Text = \"\"";
Debug.ShouldStop(32768);
main.mostCurrent._txtpreciounitario.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 49;BA.debugLine="txtIva.Text = \"\"";
Debug.ShouldStop(65536);
main.mostCurrent._txtiva.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 50;BA.debugLine="txtStock.Text = \"\"";
Debug.ShouldStop(131072);
main.mostCurrent._txtstock.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 51;BA.debugLine="Msgbox(\"Registro borrado !!\",\"Ok\")";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro borrado !!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ok"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmdinsert_click() throws Exception{
try {
		Debug.PushSubsStack("cmdInsert_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,72);
if (RapidSub.canDelegate("cmdinsert_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","cmdinsert_click");}
 BA.debugLineNum = 72;BA.debugLine="Private Sub cmdInsert_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="productos.Create( txtId.Text, txtNombreProducto.T";
Debug.ShouldStop(256);
main.mostCurrent._productos.runClassMethod (b4a.example.productos.class, "_create" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txtid.runMethod(true,"getText"))),(Object)(main.mostCurrent._txtnombreproducto.runMethod(true,"getText")),(Object)(BA.numberCast(double.class, main.mostCurrent._txtpreciounitario.runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, main.mostCurrent._txtiva.runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, main.mostCurrent._txtstock.runMethod(true,"getText"))));
 BA.debugLineNum = 74;BA.debugLine="Msgbox(\"registro insertado !!\", \"ok\")";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("registro insertado !!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ok"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmdreadbyid_click() throws Exception{
try {
		Debug.PushSubsStack("cmdReadById_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,59);
if (RapidSub.canDelegate("cmdreadbyid_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","cmdreadbyid_click");}
RemoteObject _p = RemoteObject.declareNull("b4a.example.producto");
 BA.debugLineNum = 59;BA.debugLine="Private Sub cmdReadById_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Dim p As Producto= productos.Read_ById( txtId.Tex";
Debug.ShouldStop(134217728);
_p = main.mostCurrent._productos.runClassMethod (b4a.example.productos.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txtid.runMethod(true,"getText"))));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 61;BA.debugLine="If p.IsInitialized  Then";
Debug.ShouldStop(268435456);
if (_p.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 62;BA.debugLine="txtId.Text = p.Id";
Debug.ShouldStop(536870912);
main.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 63;BA.debugLine="txtNombreProducto.Text = p.NombreProducto";
Debug.ShouldStop(1073741824);
main.mostCurrent._txtnombreproducto.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_nombreproducto" /*RemoteObject*/ )));
 BA.debugLineNum = 64;BA.debugLine="txtPrecioUnitario.Text = p.PrecioUnitario";
Debug.ShouldStop(-2147483648);
main.mostCurrent._txtpreciounitario.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_preciounitario" /*RemoteObject*/ )));
 BA.debugLineNum = 65;BA.debugLine="txtIva.Text = p.IVA";
Debug.ShouldStop(1);
main.mostCurrent._txtiva.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_iva" /*RemoteObject*/ )));
 BA.debugLineNum = 66;BA.debugLine="txtStock.Text = p.Stock";
Debug.ShouldStop(2);
main.mostCurrent._txtstock.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_stock" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 68;BA.debugLine="Msgbox(\"producto no encontrado \", \"Error\")";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("producto no encontrado ")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmdupdate_click() throws Exception{
try {
		Debug.PushSubsStack("cmdUpdate_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,54);
if (RapidSub.canDelegate("cmdupdate_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","cmdupdate_click");}
 BA.debugLineNum = 54;BA.debugLine="Private Sub cmdUpdate_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="productos.Update( txtId.Text, txtNombreProducto.T";
Debug.ShouldStop(4194304);
main.mostCurrent._productos.runClassMethod (b4a.example.productos.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txtid.runMethod(true,"getText"))),(Object)(main.mostCurrent._txtnombreproducto.runMethod(true,"getText")),(Object)(BA.numberCast(double.class, main.mostCurrent._txtpreciounitario.runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, main.mostCurrent._txtiva.runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, main.mostCurrent._txtstock.runMethod(true,"getText"))));
 BA.debugLineNum = 56;BA.debugLine="Msgbox(\"registro actualizado !!\", \"Ok\")";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("registro actualizado !!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ok"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private txtId As EditText";
main.mostCurrent._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private txtNombreProducto As EditText";
main.mostCurrent._txtnombreproducto = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private txtPrecioUnitario As EditText";
main.mostCurrent._txtpreciounitario = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private txtIva As EditText";
main.mostCurrent._txtiva = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private txtStock As EditText";
main.mostCurrent._txtstock = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private productos As Productos";
main.mostCurrent._productos = RemoteObject.createNew ("b4a.example.productos");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
producto.myClass = BA.getDeviceClass ("b4a.example.producto");
productos.myClass = BA.getDeviceClass ("b4a.example.productos");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}