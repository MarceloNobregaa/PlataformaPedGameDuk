package com.MarceloNotebook.PlataformaPedGameDukgit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Persistencia {
	static Persistencia persistencia = new Persistencia();

	public static Persistencia getPersistencia() {
		return persistencia;
	}

	public static void reset() {
		persistencia = new Persistencia();
	}

	public void persistir() {
		FileOutputStream fos = null;
		ObjectOutputStream stream = null;
		try {
			fos = new FileOutputStream("file.bin");
			stream = new ObjectOutputStream(fos);
			stream.writeObject(persistencia);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void recuperar() {
		FileInputStream fis = null;
		ObjectInputStream stream = null;
		try {
			File arquivo = new File("file.bin");
			if (arquivo.exists()) {
				fis = new FileInputStream(arquivo);
				stream = new ObjectInputStream(fis);
				persistencia = (Persistencia) stream.readObject();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}


