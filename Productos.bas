B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private sql As SQL
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize( nombreBdd As String)
	sql.Initialize( File.DirInternal, nombreBdd, True)
	
	sql.ExecNonQuery("CREATE TABLE IF NOT EXISTS productos( id INT PRIMARY KEY, nombreProducto TEXT(50), precioUnitario NUMBER(10,3), iva NUMBER(5,3), stock NUMBER(10,3) )")
End Sub

Public Sub Create( id As Int, nombreProducto As String, precioUnitario As Double, iva As Double, stock As Double) As Producto
	sql.ExecNonQuery2("INSERT INTO productos( id, nombreProducto, precioUnitario, iva, stock ) VALUES ( ?, ?, ?, ?, ? )", Array As Object( id, nombreProducto, precioUnitario, iva, stock ))
	
	Dim p As Producto 
	p.Initialize
	
	p.Id = id
	p.NombreProducto = nombreProducto
	p.PrecioUnitario = precioUnitario
	p.IVA = iva
	p.Stock = stock
	
	Return p
End Sub

Public Sub Read_All () As List
	Dim resultado As List
	resultado.Initialize
	
	 Dim cursor As Cursor
	 cursor = sql.ExecQuery("SELECT id, nombreProducto, precioUnitario, iva, stock FROM productos ORDER BY nombreProducto")
	 For i=0 To cursor.RowCount-1
	 	cursor.Position = i
		
		Dim p As Producto
		p.Initialize
		p.Id = cursor.GetInt("id")
		p.NombreProducto = cursor.GetString("nombreProducto")
		p.PrecioUnitario = cursor.GetDouble("precioUnitario")
		p.IVA = cursor.GetDouble("iva")
		p.Stock = cursor.GetDouble("stock")
		
		resultado.Add(p)
	Next
	
	Return resultado
End Sub

Public Sub Read_ById( id As Int) As Producto
	Dim p As Producto
	
	Dim cursor As Cursor
	cursor = sql.ExecQuery("SELECT id, nombreProducto, precioUnitario, iva, stock FROM productos WHERE id = " & id)
	If cursor.RowCount > 0 Then
		cursor.Position = 0
		
		p.Initialize
		p.Id = cursor.GetInt("id")
		p.NombreProducto = cursor.GetString("nombreProducto")
		p.PrecioUnitario = cursor.GetDouble("precioUnitario")
		p.IVA = cursor.GetDouble("iva")
		p.Stock = cursor.GetDouble("stock") 
		
	End If
	Return p
End Sub

Public Sub Update(id As Int, nombreProducto As String, precioUnitario As Double, iva As Double, stock As Double) As Boolean
	sql.ExecNonQuery2("UPDATE productos SET nombreProducto = ?, precioUnitario = ?, iva = ?, stock = ? WHERE id = ?", Array As Object( nombreProducto, precioUnitario, iva, stock, id ))  
	Return True
End Sub

Public Sub Delete(id As Int) As Boolean
	sql.ExecNonQuery("DELETE FROM productos WHERE id = " & id)
	Return True
End Sub