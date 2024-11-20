package com.tap.userdetailsdaoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tap.database.MyConnect;
import com.tap.userdetails.UserDetails;
import com.tap.userdetailsdao.UserDetailsDAO;

public class UserDetailsDAOImpl implements UserDetailsDAO{
	
	private Connection connection;

	public UserDetailsDAOImpl() {
		
		connection = MyConnect.connect();
		
	}

	private static final String INSERT_QUERY = "INSERT INTO user_details (first_name, last_name, email, phone, address, city, state, zip) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT_BY_ID_QUERY = "SELECT * FROM user_details WHERE id = ?";
    private static final String SELECT_ALL_QUERY = "SELECT * FROM user_details";
    private static final String UPDATE_QUERY = "UPDATE user_details SET first_name = ?, last_name = ?, email = ?, phone = ?, address = ?, city = ?, state = ?, zip = ? WHERE id = ?";
    private static final String DELETE_QUERY = "DELETE FROM user_details WHERE id = ?";

    @Override
    public void save(UserDetails userDetails) {
        try (PreparedStatement statement = connection.prepareStatement(INSERT_QUERY)) {

            statement.setString(1, userDetails.getFirstName());
            statement.setString(2, userDetails.getLastName());
            statement.setString(3, userDetails.getEmail());
            statement.setString(4, userDetails.getPhone());
            statement.setString(5, userDetails.getAddress());
            statement.setString(6, userDetails.getCity());
            statement.setString(7, userDetails.getState());
            statement.setString(8, userDetails.getZip());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public UserDetails findById(int id) {
        UserDetails userDetails = null;

        try (
             PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {

            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                userDetails = mapRow(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userDetails;
    }

    @Override
    public List<UserDetails> findAll() {
        List<UserDetails> users = new ArrayList<>();

        try (
        		Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(SELECT_ALL_QUERY);

            while (resultSet.next()) {
                users.add(mapRow(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    @Override
    public void update(UserDetails userDetails) {
        try (
             PreparedStatement statement = connection.prepareStatement(UPDATE_QUERY)) {

            statement.setString(1, userDetails.getFirstName());
            statement.setString(2, userDetails.getLastName());
            statement.setString(3, userDetails.getEmail());
            statement.setString(4, userDetails.getPhone());
            statement.setString(5, userDetails.getAddress());
            statement.setString(6, userDetails.getCity());
            statement.setString(7, userDetails.getState());
            statement.setString(8, userDetails.getZip());
            statement.setInt(9, userDetails.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try (
             PreparedStatement statement = connection.prepareStatement(DELETE_QUERY)) {

            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private UserDetails mapRow(ResultSet resultSet) throws SQLException {
        UserDetails userDetails = new UserDetails();

        userDetails.setId(resultSet.getInt("id"));
        userDetails.setFirstName(resultSet.getString("first_name"));
        userDetails.setLastName(resultSet.getString("last_name"));
        userDetails.setEmail(resultSet.getString("email"));
        userDetails.setPhone(resultSet.getString("phone"));
        userDetails.setAddress(resultSet.getString("address"));
        userDetails.setCity(resultSet.getString("city"));
        userDetails.setState(resultSet.getString("state"));
        userDetails.setZip(resultSet.getString("zip"));

        return userDetails;
    }
	
}
