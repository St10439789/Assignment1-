/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhostpackage com.example.studentmanager.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.example.studentmanager.StudentManager;/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package student.management.application;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.example.studentmanager.StudentManager;
import org.junit.jupiter.api.Test;

/**
 *
 * @author RC_Student_lab
 */
public class STUDENTMANAGEMENTAPPLICATIONTest {
    
 



public class StudentManagerTest {

    private StudentManager manager;

    @Before
    public void setUp() {
        manager = new StudentManager();
    }

    @Test
    public void testCaptureStudent() {
        manager.captureStudent(10111, "J. Bloggs", 19, "jbloggs@ymail.com", "disd");
        StudentManager.Student student = manager.searchStudent(10111);
        assertNotNull(student);
        assertEquals(10111, student.getStudentId());
        assertEquals("J. Bloggs", student.getName());
    }

    @Test
    public void testSearchStudent() {
        manager.captureStudent(10112, "J. Doe", 21, "jdoe@ymail.com", "disd");
        StudentManager.Student student = manager.searchStudent(10112);
        assertNotNull(student);
        assertEquals(10112, student.getStudentId());
        assertEquals("J. Doe", student.getName());
    }

    @Test
    public void testSearchStudent_StudentNotFound() {
        StudentManager.Student student = manager.searchStudent(99999);
        assertNull(student);
    }

    @Test
    public void testDeleteStudent() {
        manager.captureStudent(10113, "P. Parker", 20, "spidey@ymail.com", "disn");
        boolean result = manager.deleteStudent(10113);
        assertTrue(result);
        assertNull(manager.searchStudent(10113));
    }

    @Test
    public void testDeleteStudent_StudentNotFound() {
        boolean result = manager.deleteStudent(99999);
        assertFalse(result);
    }

    @Test
    public void testGetValidStudentAge_ValidAge() {
        int age = manager.getValidStudentAge("18");
        assertEquals(18, age);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetValidStudentAge_InvalidAge() {
        manager.getValidStudentAge("15");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetValidStudentAge_InvalidCharacter() {
        manager.getValidStudentAge("invalid");
    }

    @Test
    public void testPrintReport() {
        manager.captureStudent(10114, "Valid Age", 18, "validage@ymail.com", "disd");
        manager.captureStudent(10115, "Another Student", 20, "another@ymail.com", "disd");
        assertEquals(2, manager.getStudentReport().size());
    }

        private void assertEquals(int i, int age) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void assertTrue(boolean result) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
