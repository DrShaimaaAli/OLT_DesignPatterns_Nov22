package FactoryMethod;

public class ExcelApp extends OfficeApp{

		public  Document documentFactory()
		{
			return new ExcelDoc();
		}
}
