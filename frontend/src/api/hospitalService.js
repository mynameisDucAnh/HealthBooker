import axiosInstance from './axiosInstance';
import { API_BASE_URL } from './apiConfig';

// Fetch all hospitals
export async function fetchHospitals(page = 0, limit = 12) {
  try {
    const response = await fetch(`${API_BASE_URL}/hospital?page=${page}&limit=${limit}`); 
    if (!response.ok) {
      throw new Error("Network response was not ok");
    }
    const data = await response.json();
    console.log(data); // In dữ liệu để kiểm tra cấu trúc
    return data; // Đảm bảo trả về đúng dữ liệu cần thiết
  } catch (error) {
    console.error("Error fetching hospitals:", error);
    throw error; // Ném lỗi để xử lý ở nơi gọi hàm
  }
}

// Create a new hospital
export const createHospital = async (hospital) => {
  try {
    const response = await axiosInstance.post('/doctor', hospital);
    return response.data;
  } catch (error) {
    console.error('Error creating hospital:', error);
    throw error;
  }
};

// Update an existing hospital
export const updateHospital = async (id, hospital) => {
  try {
    const response = await axiosInstance.put(`/hospital/${id}`, hospital);
    return response.data;
  } catch (error) {
    console.error('Error updating hospital:', error);
    throw error;
  }
};

// Delete a hospital
export const deleteHospital = async (id) => {
  try {
    const response = await axiosInstance.delete(`/hospital/${id}`);
    return response.data;
  } catch (error) {
    console.error('Error deleting hospital:', error);
    throw error;
  }
};

// Upload hospital images
export const uploadHospitalImages = async (hospitalId, files) => {
  const formData = new FormData();
  for (let i = 0; i < files.length; i++) {
    formData.append('files', files[i]);
  }

  try {
    const response = await axiosInstance.post(
      `/hospital/upload/${hospitalId}`,
      formData,
      {
        headers: {
          'Content-Type': 'multipart/form-data',
        },
      }
    );
    return response.data;
  } catch (error) {
    console.error('Error uploading hospital images:', error);
    throw error;
  }
};