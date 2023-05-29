package com.Collection.ServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Collection.Dto.ResponseDto;
import com.Collection.Dto.CollMap;
import com.Collection.Dto.CollectionCommonDto;
import com.Collection.Dto.CollectionMapTwoDto;
import com.Collection.Dto.EmployeeAddressDto;
import com.Collection.Dto.EmployeeDto;
import com.Collection.Dto.ListDto;
import com.Collection.Entity.CollectionMap;
import com.Collection.Entity.EmployeeAddressEntity;
import com.Collection.Entity.EmployeeEntity;
import com.Collection.Entity.ListEntity;
import com.Collection.Repository.CollectionMapRepository;
import com.Collection.Repository.EmployeeAddressRepository;
import com.Collection.Repository.EmployeeRepository;
import com.Collection.Repository.ListRepository;
import com.Collection.Service.ListService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.MapType;

@Service
public class ListServiceImpl implements ListService {

	@Autowired
	protected final static Logger logger = LoggerFactory.getLogger(ListServiceImpl.class);

	@Autowired
	private ListRepository listreppository;

	@Autowired
	private CollectionMapRepository collectionMapRepository;

	@Autowired
	private EmployeeAddressRepository employeeAddressRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public ResponseDto<?> savenew(CollectionCommonDto likedList) {
		ResponseDto<?> response = new ResponseDto<>();

		try {

			for (ListDto Dto : likedList.getRequest()) {
				ListEntity entity = new ListEntity();
				// entity.setId(Dto.getId());
				entity.setName(Dto.getName());
				entity.setValue(Dto.getValue());

				listreppository.save(entity);
				response.setResponse("saved");
			}

		} catch (Exception e) {
			e.printStackTrace();
			response.setResponse("please check your data");
			logger.debug("Linked List Data Not Save Plaese Check");

		}

		return response;
	}

	@Override
	public ResponseDto<?> getLinked(String name) {
		ResponseDto<?> response = new ResponseDto<>();
		try {
			if (name != null && !name.isEmpty()) {
				LinkedList<ListEntity> linked = listreppository.findByName(name);
				if (!linked.isEmpty()) {
					for (ListEntity entity : linked) {
						ListDto dto = new ListDto();
						dto.setId(entity.getId());
						dto.setName(entity.getName());
						dto.setValue(entity.getValue());
						response.setResponseList(linked);
						response.setResponse("Your Data");
					}
				} else {
					response.setResponse("Please Enter Your Correct Name" + "  (Or) " + " Your Name Not Found");
				}

			} else {
				response.setResponse("your Is Empty.......please Enter Name");
			}

		} catch (Exception e) {
			e.printStackTrace();
			response.setResponse("Your Name Not Found");
			logger.debug(" Not Found Your Data Plaese Check");
		}
		return response;
	}

	@Override
	public ResponseDto<?> saveNewEmployee(ArrayList<EmployeeDto> request) {
		ResponseDto<?> response = new ResponseDto<>();
		try {
			// List<EmployeeDto> empDto=new ArrayList<EmployeeDto>(request);

			for (EmployeeDto employeeDto : request) {
				EmployeeEntity empEntity = new EmployeeEntity();
				empEntity.setId(employeeDto.getId());
				empEntity.setName(employeeDto.getName());

				// EmployeeDto employeeAddDto=new EmployeeDto();
				List<EmployeeAddressEntity> employeeAddressEntitys = new ArrayList<EmployeeAddressEntity>();
				for (EmployeeAddressDto employeeAddressDto : employeeDto.getAddress()) {
					EmployeeAddressEntity addressEntity = new EmployeeAddressEntity();
					addressEntity.setId(employeeAddressDto.getId());
					addressEntity.setAddress(employeeAddressDto.getAddress());
					addressEntity.setCity(employeeAddressDto.getCity());
					addressEntity.setDistrict(employeeAddressDto.getDistrict());
					addressEntity.setPincode(employeeAddressDto.getPincode());
					addressEntity.setState(employeeAddressDto.getState());
					addressEntity.setEmployeeEntity(empEntity);
					// empEntity.setEmployee(addressEntity);

					employeeAddressEntitys.add(addressEntity);
				}

				empEntity.setEmployee(employeeAddressEntitys);
				employeeRepository.save(empEntity);
			}
			response.setResponse("saved");
		} catch (Exception e) {
			e.printStackTrace();
			response.setResponse("please check your data");
			logger.debug("Employee List Data Not Save Plaese Check");
		}
		return response;

	}

	@Override
	public ResponseDto<?> getEmployee(String name) {
		ResponseDto<?> response = new ResponseDto<>();
		try {
			if (name != null && !name.isEmpty()) {
				ArrayList<EmployeeEntity> Employee = employeeRepository.findByName(name);
				if (!Employee.isEmpty()) {
					ArrayList<EmployeeDto> empDto = new ArrayList<>();
					for (EmployeeEntity entity : Employee) {
						EmployeeDto dto = new EmployeeDto();
						dto.setId(entity.getId());
						dto.setName(entity.getName());
						ArrayList<EmployeeAddressDto> employee = new ArrayList<EmployeeAddressDto>();
						for (EmployeeAddressEntity employeeAddressEntity : entity.getEmployee()) {
							EmployeeAddressDto empAddressdto = new EmployeeAddressDto();
							empAddressdto.setId(employeeAddressEntity.getId());
							empAddressdto.setAddress(employeeAddressEntity.getAddress());
							empAddressdto.setCity(employeeAddressEntity.getCity());
							empAddressdto.setDistrict(employeeAddressEntity.getDistrict());
							empAddressdto.setPincode(employeeAddressEntity.getPincode());
							empAddressdto.setState(employeeAddressEntity.getState());
							// empAddressdto.setEmployeeDto(dto);
							employee.add(empAddressdto);

						}
						dto.setAddress(employee);
						empDto.add(dto);
						response.setResponseList(empDto);
					}

					response.setResponse("Your Data");

				} else {
					response.setResponse("Please Enter Your Correct Name" + "  (Or) " + " Your Name Not Found");
				}

			} else {
				response.setResponse("your Is Empty.......please Enter Name");
			}

		} catch (Exception e) {
			e.printStackTrace();
			response.setResponse("Your Name Not Found");
			logger.debug(" Not Found Your Data Plaese Check");
		}
		return response;
	}

	@Override
	public ResponseDto<?> getEmployeeInfo(String name, String state) {
		ResponseDto<?> response = new ResponseDto<>();
		try {
			if (name != null && !name.isEmpty() && !state.isEmpty() && state != null) {
				// ArrayList<EmployeeEntity> Employee =
				// employeeRepository.findByNameAndEmployeeState(name, state);
				// if (!Employee.isEmpty()) {
				// ArrayList<EmployeeDto> empDto = new ArrayList<>();
				/// for (EmployeeEntity entity : Employee) {
				// EmployeeDto dto = new EmployeeDto();
				// dto.setId(entity.getId());
				// dto.setName(entity.getName());
				// List<EmployeeAddressEntity> employeeState = entity.getEmployee();
				List<EmployeeAddressEntity> employeeState1 = employeeAddressRepository
						.findByStateAndEmployeeEntityName(state, name);

				ArrayList<EmployeeAddressDto> employeeAddEntityes = new ArrayList<EmployeeAddressDto>();
				for (EmployeeAddressEntity employeeAddressEntity : employeeState1) {

					// if (state.equalsIgnoreCase(employeeAddressEntity.getState())) {
					EmployeeAddressDto empAddressdto = new EmployeeAddressDto();
					empAddressdto.setId(employeeAddressEntity.getId());
					empAddressdto.setAddress(employeeAddressEntity.getAddress());
					empAddressdto.setCity(employeeAddressEntity.getCity());
					empAddressdto.setDistrict(employeeAddressEntity.getDistrict());
					empAddressdto.setPincode(employeeAddressEntity.getPincode());
					empAddressdto.setState(employeeAddressEntity.getState());

					EmployeeDto EmployeeDto = new EmployeeDto();
					EmployeeDto.setId(employeeAddressEntity.getEmployeeEntity().getId());
					EmployeeDto.setName(employeeAddressEntity.getEmployeeEntity().getName());

					// empAddressdto.setEmployeeDto(dto);
					empAddressdto.setEmpDto(EmployeeDto);
					employeeAddEntityes.add(empAddressdto);
				}
				// }
				// dto.setAddress(employeeAddEntityes);
				// empDto.add(dto);
				response.setResponseList(employeeAddEntityes);

				// }
				response.setResponse("Your Data");
				// } else {
				// response.setResponse("Please Enter Your Correct Name (Or) State" + " (Or) "
				// + " Your Name Not Found (Or) Your State Not Found");
				// }

				// } else {
				// response.setResponse("your Name (or) State Empty.......please Enter Name (or)
				// State");
			}

		} catch (Exception e) {
			e.printStackTrace();
			response.setResponse("Your Name Not Found");
			logger.debug(" Not Found Your Data Plaese Check");
		}
		return response;
	}

	@Override
	public ResponseDto<?> getPerson() {
		ResponseDto<?> responseDto = new ResponseDto<>();
		try {
			List<CollectionMap> entity = collectionMapRepository.findAll();
			// List<CollectionMapTwoDto> dtos=new ArrayList<CollectionMapTwoDto>();
			List<Map<Long, CollectionMapTwoDto>> maps = new ArrayList<Map<Long, CollectionMapTwoDto>>();
			Map<Long, CollectionMapTwoDto> map = new HashMap<Long, CollectionMapTwoDto>();
			for (CollectionMap collection : entity) {
				CollectionMapTwoDto collectionMapTwoDto = new CollectionMapTwoDto();
				collectionMapTwoDto.setName(collection.getName());
				collectionMapTwoDto.setCode(collection.getCode());

				map.put(collection.getId(), collectionMapTwoDto);
			}
			maps.add(map);
			if (maps != null && !maps.isEmpty()) {
				responseDto.setResponse("Your Data");
				responseDto.setResponseList(maps);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseDto;
	}

	@Override
	public ResponseDto<?> savePerson(String personMap) {
		ResponseDto<?> responseDto = new ResponseDto<>();
		try {
			ObjectMapper objectMapper = new ObjectMapper();

			// Parse the JSON request body into a map of persons
			MapType mapType = objectMapper.getTypeFactory().constructMapType(Map.class, String.class, CollMap.class);
			Map<String, CollMap> personMap1 = objectMapper.readValue(personMap, mapType);

			String state = "ANDRA";
			List<Map<String, CollMap>> list = new ArrayList<>();

			for (Map.Entry<String, CollMap> entry : personMap1.entrySet()) {
				String personName = entry.getKey();
				CollMap person = entry.getValue();
				personMap1.put(personName, person);

				if (person.getState().equalsIgnoreCase(state)) {
					logger.info("User Name: " + personName + " - Name: '" + person.getName() + "' - Pin Code: '"
							+ person.getPincode() + "' - State: '" + person.getState() + "'");

					// Add the person to the response list
					Map<String, CollMap> matchingPersonMap = new HashMap<>();
					matchingPersonMap.put(personName, person);
					responseDto.setResponse("Your Filter State");
					list.add(matchingPersonMap);
				} else {
					responseDto.setResponse("Your Filter State Is Not Found ");
				}
			}

			responseDto.setResponseList(list);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return responseDto;
	}

	@Override
	public ResponseDto<?> getEmployeeInfoV(String name, String state) {
		ResponseDto<?> response = new ResponseDto<>();
		if (name == null || name.isEmpty() || state == null || state.isEmpty()) {
			response.setResponse("Your Name or State is empty. Please enter a Name and State.");
			return response;
		}

		List<EmployeeEntity> employees = employeeRepository.findByName(name);
		if (employees.isEmpty()) {
			response.setResponse("No employee found with the provided Name or State.");
			return response;
		}

		List<EmployeeDto> empDtoList = employees.stream().map(entity -> {
			EmployeeDto dto = new EmployeeDto();
			dto.setId(entity.getId());
			dto.setName(entity.getName());

			ArrayList<EmployeeAddressDto> employeeAddressDtoList = (ArrayList<EmployeeAddressDto>) entity.getEmployee()
					.stream().filter(employeeAddressEntity -> state.equalsIgnoreCase(employeeAddressEntity.getState()))
					.map(employeeAddressEntity -> {
						EmployeeAddressDto empAddressdto = new EmployeeAddressDto();
						empAddressdto.setId(employeeAddressEntity.getId());
						empAddressdto.setAddress(employeeAddressEntity.getAddress());
						empAddressdto.setCity(employeeAddressEntity.getCity());
						empAddressdto.setDistrict(employeeAddressEntity.getDistrict());
						empAddressdto.setPincode(employeeAddressEntity.getPincode());
						empAddressdto.setState(employeeAddressEntity.getState());
						return empAddressdto;
					}).collect(Collectors.toList());

			dto.setAddress(employeeAddressDtoList);
			return dto;
		}).collect(Collectors.toList());

		response.setResponseList(empDtoList);
		response.setResponse("Your Data");

		return response;
	}

	@Override
	public ResponseDto<?> getEmployeeInfo2(String name, String state) {
		ResponseDto<?> response = new ResponseDto<>();
		try {
			if (name != null && !name.isEmpty() && !state.isEmpty() && state != null) {
				ArrayList<EmployeeEntity> Employee = employeeRepository.findByEmployee_StateAndName(state, name);
				if (!Employee.isEmpty()) {
					ArrayList<EmployeeDto> empDto = new ArrayList<>();
					for (EmployeeEntity entity : Employee) {
						EmployeeDto dto = new EmployeeDto();
						dto.setId(entity.getId());
						dto.setName(entity.getName());
						List<EmployeeAddressEntity> employeeState = entity.getEmployee();

						ArrayList<EmployeeAddressDto> employeeAddEntityes = new ArrayList<EmployeeAddressDto>();
						for (EmployeeAddressEntity employeeAddressEntity : employeeState) {

							// if (state.equalsIgnoreCase(employeeAddressEntity.getState())) {
							EmployeeAddressDto empAddressdto = new EmployeeAddressDto();
							empAddressdto.setId(employeeAddressEntity.getId());
							empAddressdto.setAddress(employeeAddressEntity.getAddress());
							empAddressdto.setCity(employeeAddressEntity.getCity());
							empAddressdto.setDistrict(employeeAddressEntity.getDistrict());
							empAddressdto.setPincode(employeeAddressEntity.getPincode());
							empAddressdto.setState(employeeAddressEntity.getState());

							employeeAddEntityes.add(empAddressdto);
//					EmployeeDto EmployeeDto = new EmployeeDto();
//					EmployeeDto.setId(employeeAddressEntity.getEmployeeEntity().getId());
//					EmployeeDto.setName(employeeAddressEntity.getEmployeeEntity().getName());

							// empAddressdto.setEmployeeDto(dto);
//					empAddressdto.setEmpDto(EmployeeDto);
//					employeeAddEntityes.add(empAddressdto);
							// }
						}
						dto.setAddress(employeeAddEntityes);
						empDto.add(dto);
						response.setResponseList(empDto);

					}
					response.setResponse("Your Data");
				} else {
					response.setResponse("Please Enter Your Correct Name (Or) State" + " (Or) "
							+ " Your Name Not Found (Or) Your State Not Found");
				}

			} else {
				response.setResponse("your Name (or) State Empty.......please Enter Name (or) State");
			}

		} catch (Exception e) {
			e.printStackTrace();
			response.setResponse("Your Name Not Found");
			logger.debug(" Not Found Your Data Plaese Check");
		}
		return response;
	}
}